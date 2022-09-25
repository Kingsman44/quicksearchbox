package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.shared.g.a;
import com.google.android.apps.gsa.assistant.shared.g.b;
import com.google.android.apps.gsa.assistant.shared.g.c;
import com.google.android.apps.gsa.assistant.shared.g.f;
import com.google.android.apps.gsa.assistant.shared.p5816g.C73867g;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.ListViewPager;
import com.google.android.googlequicksearchbox.R;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
public class OpaSwipeViewListCard extends RelativeLayout implements C73867g {

    /* renamed from: a */
    public TextView f300930a;

    /* renamed from: b */
    public ListViewPager f300931b;

    public OpaSwipeViewListCard(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final C60870cx mo65343a(C90931ca caVar) {
        c createBuilder = f.d.createBuilder();
        a createBuilder2 = b.f.createBuilder();
        String obj = this.f300930a.getText().toString();
        createBuilder2.copyOnWrite();
        b bVar = createBuilder2.instance;
        obj.getClass();
        bVar.a |= 1;
        bVar.b = obj;
        createBuilder.copyOnWrite();
        f fVar = createBuilder.instance;
        b build = createBuilder2.build();
        build.getClass();
        fVar.b = build;
        fVar.a |= 1;
        SettableFuture settableFuture = new SettableFuture();
        post(new C108378gm(settableFuture, createBuilder.build()));
        return settableFuture;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f300930a = (TextView) findViewById(R.id.title);
        ListViewPager listViewPager = (ListViewPager) findViewById(R.id.list_pager);
        this.f300931b = listViewPager;
        listViewPager.setId(View.generateViewId());
    }

    public OpaSwipeViewListCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OpaSwipeViewListCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
