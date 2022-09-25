package com.google.android.libraries.lens.view.sampleimages;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.libraries.lens.view.sampleimages.f */
/* compiled from: PG */
public final /* synthetic */ class C27702f implements DialogInterface.OnKeyListener {

    /* renamed from: a */
    public final /* synthetic */ C27707k f75644a;

    public /* synthetic */ C27702f(C27707k kVar) {
        this.f75644a = kVar;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        C27707k kVar = this.f75644a;
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        C47393f.m84235f(new C27699c(), kVar.f75649a);
        return true;
    }
}
