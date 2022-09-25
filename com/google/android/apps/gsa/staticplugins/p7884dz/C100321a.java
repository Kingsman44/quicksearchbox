package com.google.android.apps.gsa.staticplugins.p7884dz;

import android.content.Context;
import android.content.MutableContextWrapper;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.dz.a */
/* compiled from: PG */
public final class C100321a {

    /* renamed from: a */
    public boolean f280539a = false;

    /* renamed from: b */
    public final Map f280540b = new HashMap();

    /* renamed from: c */
    private C100324d f280541c;

    /* renamed from: a */
    public final synchronized Context mo91877a(Context context, String str) {
        if (this.f280539a) {
            return new C100322b(context, mo91878b());
        }
        MutableContextWrapper mutableContextWrapper = new MutableContextWrapper(context);
        this.f280540b.put(str, mutableContextWrapper);
        return mutableContextWrapper;
    }

    /* renamed from: b */
    public final synchronized C100324d mo91878b() {
        if (this.f280541c == null) {
            this.f280541c = new C100324d();
        }
        return this.f280541c;
    }

    /* renamed from: c */
    public final void mo91879c(String str, String str2, String str3, String str4, String str5) {
        if (this.f280539a) {
            C100324d b = mo91878b();
            StringBuilder sb = new StringBuilder(String.format("Event-Name [%s] TTS-Type [%s]", new Object[]{str2, str3}));
            if (str4 != null) {
                sb.append(String.format(" Utterance [%s]", new Object[]{str4}));
            }
            if (str5 != null) {
                sb.append(String.format(" AudioData [%s]", new Object[]{str5}));
            }
            String sb2 = sb.toString();
            C59104x b2 = C100324d.f280546a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "TestingEventLogger");
            C59052c cVar = (C59052c) b2;
            cVar.mo56378ag(C58975e.f156826a, str);
            ((C59052c) cVar.mo56372aa(33311)).mo56389s("%s", sb2);
            b.mo91885a(str2, sb2);
        }
    }

    /* renamed from: d */
    public final void mo91880d(String str) {
        if (this.f280539a) {
            mo91878b().mo91885a("INTENT_START", str);
        }
    }
}
