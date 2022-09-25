package com.google.android.apps.gsa.search.core.preferences.cards;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class RelationshipListItem extends LinearLayout {

    /* renamed from: a */
    TextView f233342a;

    /* renamed from: b */
    TextView f233343b;

    public RelationshipListItem(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        this.f233342a = (TextView) findViewById(R.id.relationship);
        this.f233343b = (TextView) findViewById(R.id.person);
    }

    public RelationshipListItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RelationshipListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
