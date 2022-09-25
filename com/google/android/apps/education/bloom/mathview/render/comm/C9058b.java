package com.google.android.apps.education.bloom.mathview.render.comm;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.comm.b */
/* compiled from: PG */
public final class C9058b extends InputConnectionWrapper {

    /* renamed from: a */
    final /* synthetic */ C69626l f31288a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9058b(InputConnection inputConnection, C69626l lVar) {
        super(inputConnection, false);
        this.f31288a = lVar;
    }

    public final boolean performPrivateCommand(String str, Bundle bundle) {
        if (!C69664n.m101066l(str, "com.google.android.apps.education.bloom.mathview.render.comm.COMMAND_ACTION")) {
            return super.performPrivateCommand(str, bundle);
        }
        this.f31288a.mo5761a(new C9057a(bundle));
        return true;
    }
}
