package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.util.Log;
import com.google.common.p4535g.C59203do;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58148f;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.appdatasearch.al */
/* compiled from: PG */
public final class C142796al {

    /* renamed from: a */
    final /* synthetic */ SearchResults f387591a;

    /* renamed from: b */
    private final C142797am f387592b;

    /* renamed from: c */
    private final int f387593c;

    public C142796al(SearchResults searchResults, int i, C142797am amVar) {
        this.f387591a = searchResults;
        this.f387592b = amVar;
        this.f387593c = i;
    }

    /* renamed from: k */
    private final C142795ak m231733k(String str) {
        C142795ak akVar;
        Map map;
        SearchResults searchResults;
        Bundle[] bundleArr;
        int[] iArr = this.f387591a.f387544h;
        C142795ak akVar2 = null;
        if (iArr == null) {
            return null;
        }
        Map[] mapArr = this.f387592b.f387597d;
        if (mapArr != null) {
            map = mapArr[iArr[this.f387593c]];
            if (map == null) {
                map = new HashMap();
            }
            akVar = (C142795ak) map.get(str);
        } else {
            map = null;
            akVar = null;
        }
        if (akVar != null || (bundleArr = searchResults.f387541e) == null || (searchResults = this.f387591a).f387542f == null) {
            return akVar;
        }
        int[] intArray = bundleArr[searchResults.f387544h[this.f387593c]].getIntArray(str);
        SearchResults searchResults2 = this.f387591a;
        byte[] byteArray = searchResults2.f387542f[searchResults2.f387544h[this.f387593c]].getByteArray(str);
        if (!(intArray == null || byteArray == null)) {
            akVar2 = new C142795ak(intArray, byteArray);
            if (map == null) {
                return akVar2;
            }
            map.put(str, akVar2);
        }
        return akVar2;
    }

    /* renamed from: l */
    private final String m231734l() {
        String[] strArr;
        SearchResults searchResults = this.f387591a;
        int[] iArr = searchResults.f387544h;
        if (iArr == null || (strArr = searchResults.f387545i) == null) {
            return null;
        }
        return strArr[iArr[this.f387593c]];
    }

    /* renamed from: a */
    public final double mo117705a() {
        double[] dArr = this.f387591a.f387547k;
        return dArr != null ? dArr[this.f387593c] : C59203do.f157270a;
    }

    /* renamed from: b */
    public final long mo117706b() {
        long[] jArr = this.f387591a.f387551o;
        if (jArr != null) {
            return jArr[this.f387593c];
        }
        return 0;
    }

    /* renamed from: c */
    public final long mo117707c() {
        long[] jArr = this.f387591a.f387550n;
        if (jArr != null) {
            return jArr[this.f387593c];
        }
        return 0;
    }

    /* renamed from: d */
    public final C58148f mo117708d() {
        ByteBuffer j = mo117714j();
        if (j != null && j.hasRemaining()) {
            try {
                return (C58148f) C62942bv.parseFrom((C62942bv) C58148f.f155452f, j);
            } catch (C62974ct e) {
                if (Log.isLoggable("FirebaseAppIndex", 6) || Log.isLoggable("FirebaseAppIndex", 6)) {
                    Log.e("FirebaseAppIndex", "Invalid thing_proto section", e);
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    public final String mo117709e() {
        String l = m231734l();
        if (l == null) {
            return null;
        }
        return l.substring(l.indexOf(45) + 1);
    }

    /* renamed from: f */
    public final String mo117710f() {
        byte[] bArr;
        C142797am amVar = this.f387592b;
        if (amVar.f387596c == null) {
            SearchResults searchResults = this.f387591a;
            int[] iArr = searchResults.f387553q;
            if (iArr == null || (bArr = searchResults.f387554r) == null) {
                return null;
            }
            amVar.f387596c = new C142795ak(iArr, bArr);
        }
        return amVar.f387596c.mo117703a(this.f387593c);
    }

    /* renamed from: g */
    public final String mo117711g() {
        String l = m231734l();
        if (l == null) {
            return null;
        }
        return l.substring(0, l.indexOf(45));
    }

    /* renamed from: h */
    public final String mo117712h(String str) {
        C142795ak k = m231733k(str);
        if (k == null) {
            return null;
        }
        return k.mo117703a(this.f387593c);
    }

    /* renamed from: i */
    public final String mo117713i() {
        byte[] bArr;
        C142797am amVar = this.f387592b;
        if (amVar.f387595b == null) {
            SearchResults searchResults = this.f387591a;
            int[] iArr = searchResults.f387538b;
            if (iArr == null || (bArr = searchResults.f387539c) == null) {
                return null;
            }
            amVar.f387595b = new C142795ak(iArr, bArr);
        }
        return amVar.f387595b.mo117703a(this.f387593c);
    }

    /* renamed from: j */
    public final ByteBuffer mo117714j() {
        C142795ak k = m231733k("thing_proto");
        if (k == null) {
            return null;
        }
        k.mo117704b(this.f387593c);
        return ByteBuffer.wrap(k.f387590d, k.f387588b, k.f387589c[k.f387587a]).asReadOnlyBuffer();
    }
}
