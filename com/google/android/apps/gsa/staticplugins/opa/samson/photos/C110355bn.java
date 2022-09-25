package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.graphics.Point;
import android.support.constraint.C0129a;
import android.widget.RelativeLayout;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.bn */
/* compiled from: PG */
public final /* synthetic */ class C110355bn implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C110356bo f307569a;

    public /* synthetic */ C110355bn(C110356bo boVar) {
        this.f307569a = boVar;
    }

    public final void run() {
        C110356bo boVar = this.f307569a;
        boVar.f307578i = boVar.f307571b.f307801a.mo98660a();
        if (boVar.f307578i != null) {
            boVar.f307579j.f383p = -1;
            int a = (boVar.f307577h.heightPixels - boVar.mo98584a(boVar.f307578i.y)) - boVar.f307573d.getHeight();
            C0129a aVar = boVar.f307579j;
            Point point = boVar.f307578i;
            point.getClass();
            aVar.setMargins(boVar.mo98584a(point.x), 0, 0, a);
            if (boVar.f307575f) {
                ((RelativeLayout) boVar.f307573d.getParent()).setLayoutParams(boVar.f307579j);
            } else {
                boVar.f307573d.setLayoutParams(boVar.f307579j);
            }
        } else {
            C59104x c = C110356bo.f307570a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "FooterCtr");
            ((C59052c) ((C59052c) c).mo56372aa(25872)).mo56386p("set new layout position with null points.");
        }
    }
}
