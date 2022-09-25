package com.google.android.libraries.p10923ac.p10925b.p10942i;

import android.util.Log;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a;
import com.google.common.base.C58838bb;
import dagger.C68214a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.ac.b.i.ac */
/* compiled from: PG */
public final class C147058ac implements C147089l {

    /* renamed from: d */
    private static final C147096s f397066d;

    /* renamed from: e */
    private static final C147096s f397067e;

    /* renamed from: a */
    public final Map f397068a = new HashMap();

    /* renamed from: b */
    public final String f397069b;

    /* renamed from: c */
    public volatile boolean f397070c;

    /* renamed from: f */
    private final C147058ac f397071f;

    /* renamed from: g */
    private final C68214a f397072g;

    /* renamed from: h */
    private final C147073ar f397073h;

    /* renamed from: i */
    private final Map f397074i = new HashMap();

    /* renamed from: j */
    private final C68214a f397075j;

    /* renamed from: k */
    private final C147266a f397076k;

    /* renamed from: l */
    private final C147091n f397077l;

    static {
        HashSet hashSet = new HashSet();
        C147095r.m239832a('\"', hashSet);
        f397066d = new C147096s('\"', hashSet);
        HashSet hashSet2 = new HashSet();
        C147095r.m239832a('/', hashSet2);
        C147095r.m239832a(':', hashSet2);
        f397067e = new C147096s('\\', hashSet2);
    }

    public C147058ac(C147058ac acVar, String str, String str2, C68214a aVar, C147091n nVar, C147073ar arVar, C147266a aVar2, C68214a aVar3) {
        this.f397072g = aVar;
        this.f397077l = nVar;
        this.f397071f = acVar;
        this.f397076k = aVar2;
        String str3 = str + f397067e.mo123916a(str2) + "/";
        this.f397069b = str3;
        this.f397073h = arVar;
        this.f397075j = aVar3;
        if (acVar != null) {
            synchronized (acVar.f397069b) {
                C58838bb.m90884s(!acVar.f397070c, "Factory is closed");
                C58838bb.m90869d(!acVar.f397074i.containsKey(str3), "Namespace already created");
                acVar.f397074i.put(str3, this);
            }
        }
    }

    /* renamed from: d */
    static String m239736d(String str) {
        String a = f397066d.mo123916a(str);
        return "\"" + a + "\"";
    }

    /* renamed from: e */
    private static void m239737e(C147256m mVar, Set set, String str) {
        if (Log.isLoggable(mVar.f397498b, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            Iterator it = set.iterator();
            int i = 0;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (i != 0) {
                    if (i >= 10) {
                        break;
                    }
                    sb.append(", ");
                } else {
                    sb.append(' ');
                }
                sb.append(str2);
                i++;
            }
            if (i != set.size()) {
                sb.append("...");
            }
            mVar.mo124065h(sb.toString(), new Object[0]);
        }
    }

    /* renamed from: a */
    public final C147088k mo123881a(String str) {
        String str2 = this.f397069b;
        String a = f397067e.mo123916a(str);
        return new C147057ab(str2 + a + ":", this, this.f397077l);
    }

    /* renamed from: b */
    public final C147073ar mo123882b() {
        C58838bb.m90884s(!this.f397070c, "Factory is closed");
        return this.f397073h;
    }

    /* renamed from: c */
    public final C147089l mo123883c(String str) {
        return new C147058ac(this, this.f397069b, str, this.f397072g, this.f397077l, this.f397073h, this.f397076k, this.f397075j);
    }

    public final void close() {
        synchronized (this.f397069b) {
            C58838bb.m90884s(!this.f397070c, "Factory is closed");
            if (!this.f397068a.isEmpty()) {
                m239737e((C147256m) this.f397072g.mo27525b(), this.f397068a.keySet(), "Close failed due to opened storages:");
                throw new IllegalStateException("Not every KeyValueStorage created with this factory is closed");
            } else if (this.f397074i.isEmpty()) {
                C147058ac acVar = this.f397071f;
                if (acVar != null) {
                    String str = this.f397069b;
                    synchronized (acVar.f397069b) {
                        acVar.f397074i.remove(str);
                    }
                } else {
                    this.f397073h.f397114d = true;
                }
                this.f397070c = true;
            } else {
                m239737e((C147256m) this.f397072g.mo27525b(), this.f397074i.keySet(), "Close failed due to opened factories:");
                throw new IllegalStateException("Not every KeyValueStorageFactory created with this factory is closed");
            }
        }
    }
}
