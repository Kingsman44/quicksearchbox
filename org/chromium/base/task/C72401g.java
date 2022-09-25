package org.chromium.base.task;

import android.view.Choreographer;
import java.util.concurrent.Callable;

/* renamed from: org.chromium.base.task.g */
/* compiled from: PG */
public final /* synthetic */ class C72401g implements Callable {

    /* renamed from: a */
    public static final /* synthetic */ C72401g f192557a = new C72401g();

    private /* synthetic */ C72401g() {
    }

    public final Object call() {
        return new C72397c(Choreographer.getInstance());
    }
}
