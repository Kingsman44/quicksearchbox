package com.google.android.apps.gsa.staticplugins.smartspace.p8764e;

import android.graphics.Bitmap;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.e.a */
/* compiled from: PG */
public final class C117383a {

    /* renamed from: a */
    public final int f325862a;

    /* renamed from: b */
    public final C50818do f325863b;

    /* renamed from: c */
    public final Bitmap f325864c;

    /* renamed from: d */
    public final C50794cr f325865d;

    public C117383a() {
        this.f325862a = -1;
        this.f325863b = null;
        this.f325865d = null;
        this.f325864c = null;
    }

    public C117383a(C50794cr crVar) {
        this.f325862a = 1;
        this.f325865d = crVar;
        this.f325863b = null;
        this.f325864c = null;
    }

    public C117383a(C50818do doVar) {
        this.f325862a = 0;
        this.f325863b = doVar;
        this.f325865d = null;
        this.f325864c = null;
    }

    public C117383a(C50818do doVar, Bitmap bitmap) {
        this.f325862a = 0;
        this.f325863b = doVar;
        this.f325864c = bitmap;
        this.f325865d = null;
    }

    /* renamed from: a */
    public static String m195058a(int i) {
        return i == -1 ? "NO_ACTION" : i == 0 ? "ACTION_NEW_CARD" : "ACTION_REMOVE_CARDS_WITH_TYPE";
    }
}
