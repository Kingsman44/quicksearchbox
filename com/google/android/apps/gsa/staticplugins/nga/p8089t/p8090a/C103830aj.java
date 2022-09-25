package com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a;

import android.content.Context;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import java.io.File;
import java.util.Queue;
import java.util.concurrent.Callable;
import p3186j$.util.DesugarArrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a.aj */
/* compiled from: PG */
public final /* synthetic */ class C103830aj implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f289081a;

    /* renamed from: b */
    public final /* synthetic */ Queue f289082b;

    public /* synthetic */ C103830aj(Context context, Queue queue) {
        this.f289081a = context;
        this.f289082b = queue;
    }

    public final Object call() {
        Context context = this.f289081a;
        Queue queue = this.f289082b;
        File f = C103868bu.m171814f(context);
        if (f.exists() || f.mkdir()) {
            File[] listFiles = C103868bu.m171814f(context).listFiles();
            if (listFiles == null) {
                ((C58970a) ((C58970a) C103868bu.f289129a.mo56226d()).mo56372aa(21787)).mo56386p("Failed to list files in events directory");
                return null;
            }
            C58485gu guVar = (C58485gu) DesugarArrays.stream((T[]) listFiles).sorted(C103868bu.f289130b).map(C103853bf.f289107a).filter(C103854bg.f289108a).map(C103855bh.f289109a).collect(C58370cn.f155946a);
            synchronized (queue) {
                C58485gu j = C58485gu.m89842j(queue);
                queue.clear();
                queue.addAll(guVar);
                queue.addAll(j);
            }
            return null;
        }
        ((C58970a) ((C58970a) C103868bu.f289129a.mo56226d()).mo56372aa(21788)).mo56386p("Failed to create events directory");
        return null;
    }
}
