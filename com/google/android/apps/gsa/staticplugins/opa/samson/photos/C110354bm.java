package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.view.WindowManager;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.bm */
/* compiled from: PG */
public final /* synthetic */ class C110354bm implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C110356bo f307568a;

    public /* synthetic */ C110354bm(C110356bo boVar) {
        this.f307568a = boVar;
    }

    public final void run() {
        C110356bo boVar = this.f307568a;
        int height = boVar.f307573d.getHeight();
        int width = boVar.f307573d.getWidth();
        int abs = Math.abs(boVar.mo98584a(boVar.f307571b.f307801a.f307783b) - height);
        int abs2 = Math.abs(boVar.mo98584a(boVar.f307571b.f307801a.f307782a) - width);
        int a = boVar.mo98584a(5);
        if (abs > a || abs2 > a) {
            C58976aa aaVar = C58975e.f156826a;
            ((WindowManager) boVar.f307572c.getSystemService(WindowManager.class)).getDefaultDisplay().getMetrics(boVar.f307577h);
            boVar.f307571b.mo98662a(boVar.mo98585b(boVar.f307577h.widthPixels), boVar.mo98585b(boVar.f307577h.heightPixels), boVar.mo98585b(boVar.f307573d.getWidth()), boVar.mo98585b(boVar.f307573d.getHeight()), boVar.f307572c.getResources().getConfiguration().orientation == 2, 3);
        }
    }
}
