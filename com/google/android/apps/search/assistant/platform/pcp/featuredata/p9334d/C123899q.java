package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9334d;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.d.q */
/* compiled from: PG */
public final /* synthetic */ class C123899q implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C123899q f342224a = new C123899q();

    private /* synthetic */ C123899q() {
    }

    public final C60870cx apply(Object obj) {
        Iterator it = ((List) obj).iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return C60856cj.m92900i(Boolean.valueOf(z));
                }
                Object next = it.next();
                if (next != null) {
                    Boolean bool = (Boolean) next;
                    if (z || bool.booleanValue()) {
                        z = true;
                    }
                }
            }
        }
    }
}
