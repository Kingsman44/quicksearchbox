package com.google.android.apps.gsa.staticplugins.fedass.trainingcache.p7956b;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.trainingcache.b.a */
/* compiled from: PG */
public final class C101175a extends C8848a implements C101177c {
    public C101175a(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.staticplugins.fedass.trainingcache.aidl.ITrainingCacheService");
    }

    /* renamed from: e */
    public final void mo92155e() {
        throw null;
    }

    /* renamed from: f */
    public final void mo92156f() {
        mo17263hf(10, mo17260gA());
    }

    /* renamed from: g */
    public final void mo92157g(List list) {
        Parcel gA = mo17260gA();
        gA.writeStringList(list);
        mo17263hf(11, gA);
    }

    /* renamed from: h */
    public final void mo92158h() {
        throw null;
    }

    /* renamed from: i */
    public final void mo92159i() {
        mo17263hf(1, mo17260gA());
    }

    /* renamed from: j */
    public final void mo92160j(int i, byte[] bArr, int i2) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        gA.writeByteArray(bArr);
        gA.writeInt(i2);
        mo17263hf(4, gA);
    }

    /* renamed from: k */
    public final void mo92161k(String str) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        mo17263hf(8, gA);
    }

    /* renamed from: l */
    public final void mo92162l(List list) {
        Parcel gA = mo17260gA();
        gA.writeStringList(list);
        mo17263hf(9, gA);
    }

    /* renamed from: m */
    public final void mo92163m(String str) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        mo17263hf(7, gA);
    }

    /* renamed from: n */
    public final void mo92164n() {
        mo17263hf(5, mo17260gA());
    }

    /* renamed from: o */
    public final void mo92165o() {
        mo17263hf(6, mo17260gA());
    }
}
