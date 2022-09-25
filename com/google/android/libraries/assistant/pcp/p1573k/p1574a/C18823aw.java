package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import androidx.p104d.p105a.C2164c;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.aw */
/* compiled from: PG */
public final /* synthetic */ class C18823aw implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C18832be f53016a;

    /* renamed from: b */
    public final /* synthetic */ C2164c f53017b;

    public /* synthetic */ C18823aw(C18832be beVar, C2164c cVar) {
        this.f53016a = beVar;
        this.f53017b = cVar;
    }

    public final Object call() {
        C18832be beVar = this.f53016a;
        C2164c cVar = this.f53017b;
        ((C59052c) ((C59052c) C18832be.f53038a.mo56224b()).mo56372aa(47425)).mo56389s("#scheduleEarlyExitOnSubscriptionTimeout() executing for %s.", beVar.f53040c);
        beVar.mo24189f(cVar, 13, "No more response after wait period.");
        return null;
    }
}
