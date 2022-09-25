package com.google.android.libraries.elements.internal;

import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.youtube.p5283a.p5284a.C68044ag;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.libraries.elements.internal.r */
/* compiled from: PG */
public final class C21357r {

    /* renamed from: a */
    private final FutureTask f59724a;

    public C21357r(C68044ag agVar, C21259bb bbVar, C21319z zVar) {
        this.f59724a = new FutureTask(new C21356q(agVar, bbVar, zVar));
    }

    /* renamed from: a */
    public final CommandOuterClass$Command mo26862a() {
        this.f59724a.run();
        try {
            return (CommandOuterClass$Command) this.f59724a.get();
        } catch (ExecutionException e) {
            throw new C21260bc("CommandFuture failed", e);
        } catch (InterruptedException e2) {
            throw new C21260bc("CommandFuture interrupted", e2);
        }
    }
}
