package com.google.android.apps.gsa.staticplugins.accl.performers.p7346g;

import android.support.p031v4.media.session.C0320v;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.assistant.p3897e.p3921j.C52163ho;
import com.google.assistant.p3897e.p3921j.C52180ie;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.g.an */
/* compiled from: PG */
final class C93092an extends C90888av {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f259685a;

    /* renamed from: b */
    final /* synthetic */ C0320v f259686b;

    /* renamed from: c */
    final /* synthetic */ boolean f259687c;

    /* renamed from: d */
    final /* synthetic */ boolean f259688d;

    /* renamed from: e */
    final /* synthetic */ C93094ap f259689e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93092an(C93094ap apVar, SettableFuture settableFuture, C0320v vVar, boolean z, boolean z2) {
        super("Executing media ClientOp timeout", 1, 0);
        this.f259689e = apVar;
        this.f259685a = settableFuture;
        this.f259686b = vVar;
        this.f259687c = z;
        this.f259688d = z2;
    }

    public final void run() {
        C52163ho hoVar;
        if (!this.f259685a.isDone()) {
            ((C59052c) ((C59052c) C93094ap.f259690a.mo56226d()).mo56372aa(13357)).mo56389s("Package: %s had unexpected error in the PlaybackState.", this.f259686b.mo1039g());
            this.f259689e.mo87539n();
            if (this.f259687c) {
                this.f259689e.mo87540o(this.f259686b);
            }
        }
        SettableFuture settableFuture = this.f259685a;
        C52180ie g = this.f259689e.mo87535g();
        if (this.f259688d) {
            C93094ap apVar = this.f259689e;
            hoVar = apVar.mo87534e(apVar.f259695e, this.f259686b.mo1039g());
        } else {
            hoVar = null;
        }
        settableFuture.mo57356n(C93094ap.m153161d(g, hoVar, this.f259689e.mo87537j(this.f259686b), (CharSequence) null));
    }
}
