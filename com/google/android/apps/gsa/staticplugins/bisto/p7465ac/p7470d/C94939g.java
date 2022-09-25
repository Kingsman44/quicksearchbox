package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d;

import com.google.android.libraries.p2388p.C31091a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayDeque;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.d.g */
/* compiled from: PG */
public final class C94939g {

    /* renamed from: a */
    private static final C59071e f265573a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.d.g");

    /* renamed from: b */
    private final ArrayDeque f265574b = new ArrayDeque();

    /* renamed from: c */
    private final C31091a f265575c = new C31091a();

    /* renamed from: d */
    private int f265576d;

    /* renamed from: d */
    private final void m156755d() {
        int i = this.f265576d;
        if (i > 0) {
            C31091a aVar = this.f265575c;
            if (aVar.f83743b - aVar.f83742a >= i) {
                this.f265574b.add(aVar.mo36824b(i));
                this.f265576d = 0;
                m156755d();
                return;
            }
            return;
        }
        C31091a aVar2 = this.f265575c;
        if (aVar2.f83743b - aVar2.f83742a >= 2) {
            byte a = (((byte) aVar2.mo36823a()) & 255) | ((((byte) this.f265575c.mo36823a()) & 255) << 8);
            this.f265576d = a;
            if (a <= 0) {
                C59104x c = f265573a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "GacsMessageQueue");
                ((C59052c) ((C59052c) c).mo56372aa(17649)).mo56386p("Invalid message length");
                C31091a aVar3 = this.f265575c;
                aVar3.mo36824b(aVar3.f83743b - aVar3.f83742a);
                return;
            }
            m156755d();
        }
    }

    /* renamed from: a */
    public final void mo88847a(byte[] bArr) {
        this.f265575c.mo36825c(bArr, bArr.length);
        m156755d();
    }

    /* renamed from: b */
    public final void mo88848b() {
        this.f265574b.clear();
        C31091a aVar = this.f265575c;
        aVar.mo36824b(aVar.f83743b - aVar.f83742a);
        this.f265576d = 0;
    }

    /* renamed from: c */
    public final byte[] mo88849c() {
        if (this.f265574b.isEmpty()) {
            return null;
        }
        return (byte[]) this.f265574b.removeFirst();
    }
}
