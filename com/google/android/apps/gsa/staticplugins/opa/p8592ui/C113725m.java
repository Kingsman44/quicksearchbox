package com.google.android.apps.gsa.staticplugins.opa.p8592ui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47266f;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ui.m */
/* compiled from: PG */
public final class C113725m extends Fragment {

    /* renamed from: a */
    public C90929bz f314957a;

    /* renamed from: b */
    private ArrayList f314958b;

    /* renamed from: com.google.android.apps.gsa.staticplugins.opa.ui.m$a */
    /* compiled from: PG */
    public interface C113726a {
        /* renamed from: qQ */
        void mo100587qQ(C113725m mVar);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C113726a) C47266f.m84076a(getActivity(), C113726a.class)).mo100587qQ(this);
        this.f314958b = getArguments().getParcelableArrayList("item_list");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.opa_swipe_view_list_card_fragment, viewGroup, false);
        ArrayList arrayList = this.f314958b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            SwipeViewListElement swipeViewListElement = (SwipeViewListElement) arrayList.get(i);
            LinearLayout linearLayout2 = (LinearLayout) layoutInflater.inflate(R.layout.opa_swipe_view_list_element, linearLayout, false);
            this.f314957a.mo85147l(this.f314957a.mo85138c(new C113723k(this, swipeViewListElement)), new C113724l(this, (ImageView) linearLayout2.findViewById(R.id.icon)));
            ((TextView) linearLayout2.findViewById(R.id.item_title)).setText(swipeViewListElement.f314922b);
            ((TextView) linearLayout2.findViewById(R.id.data)).setText(swipeViewListElement.f314923c);
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }
}
