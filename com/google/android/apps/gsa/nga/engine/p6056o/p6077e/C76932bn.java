package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import android.app.assist.AssistStructure;
import com.google.android.apps.gsa.assist.C9405d;
import com.google.android.libraries.search.assistant.p2510c.C32506b;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.bn */
/* compiled from: PG */
public final class C76932bn {

    /* renamed from: a */
    private AssistStructure f212402a;

    /* renamed from: b */
    private C9405d f212403b;

    public C76932bn(AssistStructure assistStructure) {
        this.f212402a = assistStructure;
    }

    /* renamed from: a */
    public final C9405d mo72363a() {
        synchronized (this) {
            if (this.f212403b == null) {
                AssistStructure assistStructure = this.f212402a;
                if (assistStructure != null) {
                    this.f212403b = C32506b.m60315a(assistStructure);
                    this.f212402a = null;
                } else {
                    this.f212403b = C9405d.f32673k;
                }
            }
        }
        return this.f212403b;
    }
}
