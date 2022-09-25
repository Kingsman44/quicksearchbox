package com.google.android.libraries.assistant.auto.ondevice.p710d.p711a;

import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.mdi.download.C28706al;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C28716av;
import com.google.android.libraries.mdi.download.C28730bh;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.p395al.p408c.p414c.p416b.C8472ao;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.d.a.c */
/* compiled from: PG */
public final class C11876c {

    /* renamed from: a */
    public static final C58974d f38221a = C58974d.m91136j();

    /* renamed from: b */
    public final String f38222b;

    /* renamed from: c */
    public final C28716av f38223c;

    /* renamed from: d */
    public final C28730bh f38224d;

    /* renamed from: e */
    public final Map f38225e = new HashMap();

    /* renamed from: f */
    public final C42813k f38226f;

    /* renamed from: g */
    public int f38227g = 0;

    /* renamed from: h */
    public C29690f f38228h = null;

    /* renamed from: i */
    public List f38229i = null;

    /* renamed from: j */
    public C8476as f38230j = null;

    public C11876c(String str, C28716av avVar, C28730bh bhVar, C42813k kVar) {
        this.f38222b = str;
        this.f38223c = avVar;
        this.f38224d = bhVar;
        this.f38226f = kVar;
    }

    /* renamed from: a */
    public final C8476as mo20269a() {
        C8476as asVar = this.f38230j;
        if (asVar != null) {
            return asVar;
        }
        C8472ao aoVar = (C8472ao) C8476as.f29413p.createBuilder();
        String str = this.f38222b;
        aoVar.copyOnWrite();
        C8476as asVar2 = (C8476as) aoVar.instance;
        str.getClass();
        asVar2.f29416a |= 1;
        asVar2.f29417b = str;
        return (C8476as) aoVar.build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo20270b(C28708an anVar) {
        for (C28706al alVar : anVar.f78003h) {
            if (this.f38225e.containsKey(alVar.f77979b)) {
                ((C58970a) ((C58970a) f38221a.mo56226d()).mo56372aa(43730)).mo56389s("Ignoring duplicate DataFile with id: %s", alVar.f77979b);
            } else {
                this.f38225e.put(alVar.f77979b, alVar);
            }
        }
        this.f38227g = anVar.f77999d;
    }

    /* renamed from: c */
    public final boolean mo20271c() {
        return this.f38228h != null;
    }
}
