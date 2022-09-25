package com.google.android.apps.gsa.staticplugins.opa.p8592ui;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import com.google.android.apps.gsa.shared.p7148ui.C90703o;
import com.google.assistant.p3897e.p3921j.p3926e.C51917dx;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ui.n */
/* compiled from: PG */
public final class C113727n extends C90703o {

    /* renamed from: c */
    private final List f314959c;

    public C113727n(FragmentManager fragmentManager, List list) {
        super(fragmentManager);
        this.f314959c = list;
    }

    /* renamed from: b */
    public final Fragment mo85033b(int i) {
        int i2 = i * 4;
        int min = Math.min(i2 + 4, this.f314959c.size());
        ArrayList arrayList = new ArrayList();
        for (C51917dx swipeViewListElement : this.f314959c.subList(i2, min)) {
            arrayList.add(new SwipeViewListElement(swipeViewListElement));
        }
        C113725m mVar = new C113725m();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("item_list", arrayList);
        mVar.setArguments(bundle);
        return mVar;
    }

    /* renamed from: k */
    public final int mo9175k() {
        return (this.f314959c.size() / 4) + (this.f314959c.size() % 4 == 0 ? 0 : 1);
    }
}
