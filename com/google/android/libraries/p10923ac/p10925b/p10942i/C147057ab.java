package com.google.android.libraries.p10923ac.p10925b.p10942i;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147178l;
import com.google.common.base.C58838bb;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.google.android.libraries.ac.b.i.ab */
/* compiled from: PG */
public final class C147057ab implements C147088k {

    /* renamed from: a */
    private final String f397062a;

    /* renamed from: b */
    private final C147058ac f397063b;

    /* renamed from: c */
    private final String f397064c;

    /* renamed from: d */
    private boolean f397065d;

    public C147057ab(String str, C147058ac acVar, C147091n nVar) {
        this.f397062a = str;
        this.f397063b = acVar;
        String d = C147058ac.m239736d(str);
        this.f397064c = d;
        try {
            SQLiteDatabase b = nVar.mo123914b();
            b.execSQL("CREATE TABLE IF NOT EXISTS " + d + " (key BLOB PRIMARY KEY, value BLOB)");
            synchronized (acVar.f397069b) {
                C58838bb.m90884s(!acVar.f397070c, "Factory is closed");
                C58838bb.m90869d(!acVar.f397068a.containsKey(str), "Storage already created");
                acVar.f397068a.put(str, this);
            }
        } catch (SQLiteException e) {
            throw new C147075at("Failed to create SQLite table for storage", e);
        }
    }

    /* renamed from: l */
    private static ContentValues m239721l(byte[] bArr, byte[] bArr2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", bArr);
        contentValues.put("value", bArr2);
        return contentValues;
    }

    /* renamed from: m */
    private final C147070ao m239722m(C147077av avVar) {
        C58838bb.m90869d(avVar instanceof C147070ao, "Transaction is not a SQLite transaction for shared SQLite storage");
        C147070ao aoVar = (C147070ao) avVar;
        C58838bb.m90869d(aoVar.mo123887a() == mo123879j(), "Using a transaction from a wrong namespace");
        return aoVar;
    }

    /* renamed from: n */
    private final C147071ap m239723n(C147078aw awVar) {
        C58838bb.m90869d(awVar instanceof C147071ap, "Transaction is not a SQLite write transaction for shared SQLite storage");
        C147071ap apVar = (C147071ap) awVar;
        C58838bb.m90869d(apVar.mo123887a() == mo123879j(), "Using a transaction from a wrong namespace");
        return apVar;
    }

    /* renamed from: o */
    private static String m239724o(String str, String str2) {
        if (str2 == null) {
            return "key>=".concat(str);
        }
        return "key>=" + str + " AND key<" + str2;
    }

    /* renamed from: a */
    public final C63088z mo123869a(C147077av avVar, C63088z zVar) {
        byte[] i = mo123878i(avVar, zVar.mo59174N());
        if (i == null) {
            return null;
        }
        return C63088z.m96139A(i);
    }

    /* renamed from: b */
    public final Collection mo123870b(C147077av avVar, byte[] bArr, byte[] bArr2) {
        String str;
        ArrayList arrayList = new ArrayList();
        C147102y yVar = new C147102y(arrayList);
        String a = C147178l.m240008a(bArr);
        if (bArr2 == null) {
            str = null;
        } else {
            str = C147178l.m240008a(bArr2);
        }
        C147070ao m = m239722m(avVar);
        String str2 = this.f397064c;
        String o = m239724o(a, str);
        ((Boolean) m.mo123893f("SELECT key, value FROM " + str2 + " WHERE " + o, new C147056aa(yVar))).booleanValue();
        return arrayList;
    }

    /* renamed from: c */
    public final void mo123871c(C147078aw awVar, C63088z zVar) {
        byte[] N = zVar.mo59174N();
        C147071ap n = m239723n(awVar);
        String str = this.f397064c;
        String a = C147178l.m240008a(N);
        n.mo123900i("DELETE FROM " + str + " WHERE key=" + a);
    }

    public final void close() {
        C58838bb.m90884s(!this.f397065d, "Storage is closed");
        C147058ac acVar = this.f397063b;
        String str = this.f397062a;
        synchronized (acVar.f397069b) {
            acVar.f397068a.remove(str);
        }
        this.f397065d = true;
    }

    /* renamed from: d */
    public final void mo123873d(C147078aw awVar, C63088z zVar, C63088z zVar2) {
        mo123874e(awVar, zVar.mo59174N(), zVar2 == null ? null : zVar2.mo59174N());
    }

    /* renamed from: e */
    public final void mo123874e(C147078aw awVar, byte[] bArr, byte[] bArr2) {
        String str;
        String a = C147178l.m240008a(bArr);
        if (bArr2 == null) {
            str = null;
        } else {
            str = C147178l.m240008a(bArr2);
        }
        C147071ap n = m239723n(awVar);
        String str2 = this.f397064c;
        String o = m239724o(a, str);
        n.mo123900i("DELETE FROM " + str2 + " WHERE " + o);
    }

    /* renamed from: f */
    public final void mo123875f(C147078aw awVar, C63088z zVar, C63088z zVar2) {
        m239723n(awVar).mo123899h(this.f397064c, m239721l(zVar.mo59174N(), zVar2.mo59174N()));
    }

    /* renamed from: g */
    public final void mo123876g(C147078aw awVar, byte[] bArr, byte[] bArr2) {
        m239723n(awVar).mo123899h(this.f397064c, m239721l(bArr, bArr2));
    }

    /* renamed from: h */
    public final boolean mo123877h(C147077av avVar) {
        C147070ao m = m239722m(avVar);
        String str = this.f397064c;
        return ((Boolean) m.mo123893f("SELECT EXISTS(SELECT 1 FROM " + str + " LIMIT 1)", C147100w.f397161a)).booleanValue();
    }

    /* renamed from: i */
    public final byte[] mo123878i(C147077av avVar, byte[] bArr) {
        C147070ao m = m239722m(avVar);
        String str = this.f397064c;
        String a = C147178l.m240008a(bArr);
        return (byte[]) m.mo123893f("SELECT key, value FROM " + str + " WHERE key=" + a, C147101x.f397162a);
    }

    /* renamed from: j */
    public final C147073ar mo123879j() {
        C58838bb.m90884s(!this.f397065d, "Storage is closed");
        return this.f397063b.mo123882b();
    }

    /* renamed from: k */
    public final void mo123880k(C147077av avVar, C63088z zVar, C147087j jVar) {
        String a = C147178l.m240008a(zVar.mo59174N());
        C147070ao m = m239722m(avVar);
        String str = this.f397064c;
        String o = m239724o(a, (String) null);
        ((Boolean) m.mo123893f("SELECT key, value FROM " + str + " WHERE " + o, new C147103z(jVar))).booleanValue();
    }
}
