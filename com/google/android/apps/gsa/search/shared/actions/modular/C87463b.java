package com.google.android.apps.gsa.search.shared.actions.modular;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.MessageLite;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.modular.b */
/* compiled from: PG */
public final class C87463b extends C87467f {

    /* renamed from: a */
    private static final C59071e f236226a = C59071e.m91332i("com.google.android.apps.gsa.search.shared.actions.modular.b");

    /* renamed from: b */
    private final Set f236227b;

    /* renamed from: c */
    private final StringBuilder f236228c;

    /* renamed from: d */
    private final boolean f236229d;

    /* renamed from: e */
    private final boolean f236230e;

    public C87463b(boolean z, boolean z2) {
        this.f236229d = z;
        this.f236230e = z2;
        StringBuilder sb = null;
        this.f236227b = z2 ? new HashSet() : null;
        this.f236228c = z2 ? new StringBuilder() : sb;
    }

    /* renamed from: a */
    public final void mo81395a(String str, MessageLite messageLite, Throwable th) {
        if (this.f236229d) {
            if (messageLite != null && f236226a.mo56223a(Level.SEVERE).mo56369V()) {
                str = str + ":\n" + messageLite.toString();
            }
            if (th == null) {
                ((C59052c) ((C59052c) f236226a.mo56225c()).mo56372aa(9539)).mo56389s("%s", str);
            } else {
                ((C59052c) ((C59052c) ((C59052c) f236226a.mo56225c()).mo56382g(th)).mo56372aa(9538)).mo56389s("%s", str);
            }
            if (this.f236230e && !this.f236227b.contains(str)) {
                if (this.f236228c.length() != 0) {
                    this.f236228c.append(10);
                }
                this.f236227b.add(str);
                this.f236228c.append(str);
            }
        }
    }
}
