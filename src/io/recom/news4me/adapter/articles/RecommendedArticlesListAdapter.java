package io.recom.news4me.adapter.articles;

import io.recom.news4me.helper.NewsType;

import com.actionbarsherlock.app.SherlockFragmentActivity;

public class RecommendedArticlesListAdapter extends ArticlesListAdapter {

	public RecommendedArticlesListAdapter(SherlockFragmentActivity activity) {
		super(activity);

		newsType = NewsType.Recommended;
	}

}