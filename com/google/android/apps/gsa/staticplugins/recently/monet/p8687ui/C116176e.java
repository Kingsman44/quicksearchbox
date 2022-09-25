package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.Property;
import com.google.android.libraries.p576aq.p578b.C10503aj;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.e */
/* compiled from: PG */
public abstract class C116176e {

    /* renamed from: a */
    static final Property f322139a = C10503aj.m25470a(Boolean.class, "showing", C116134a.f322048a, C116173b.f322136a);

    /* renamed from: b */
    static final Property f322140b = C10503aj.m25470a(String.class, "message", C116174c.f322137a, C116175d.f322138a);

    /* renamed from: h */
    public static final /* synthetic */ int f322141h = 0;

    /* renamed from: c */
    final Resources f322142c;

    /* renamed from: d */
    final Context f322143d;

    /* renamed from: e */
    final DialogInterface.OnCancelListener f322144e;

    /* renamed from: f */
    AlertDialog f322145f;

    /* renamed from: g */
    public String f322146g;

    public C116176e(Resources resources, Context context, DialogInterface.OnCancelListener onCancelListener) {
        this.f322142c = resources;
        this.f322143d = context;
        this.f322144e = onCancelListener;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AlertDialog mo102532a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo102533b(AlertDialog alertDialog) {
    }
}
