package com.google.android.voiceinteraction;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.gsa.nga.shared.p6339f.p6340a.C81026c;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.voiceinteraction.aq */
/* compiled from: PG */
public final class C45388aq extends C8848a implements C45390as {
    public C45388aq(IBinder iBinder) {
        super(iBinder, "com.google.android.voiceinteraction.IGsaVoiceInteractionService");
    }

    /* renamed from: a */
    public final int mo49490a(String str) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        Parcel gT = mo17261gT(2, gA);
        int readInt = gT.readInt();
        gT.recycle();
        return readInt;
    }

    /* renamed from: b */
    public final int mo49491b(String str) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        Parcel gT = mo17261gT(6, gA);
        int readInt = gT.readInt();
        gT.recycle();
        return readInt;
    }

    /* renamed from: c */
    public final int mo49492c(String str, String str2) {
        throw null;
    }

    /* renamed from: d */
    public final Intent mo49493d(String str) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        Parcel gT = mo17261gT(7, gA);
        Intent intent = (Intent) C8850c.m23492a(gT, Intent.CREATOR);
        gT.recycle();
        return intent;
    }

    /* renamed from: e */
    public final Intent mo49494e(String str) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        Parcel gT = mo17261gT(8, gA);
        Intent intent = (Intent) C8850c.m23492a(gT, Intent.CREATOR);
        gT.recycle();
        return intent;
    }

    /* renamed from: f */
    public final Intent mo49495f(String str) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        Parcel gT = mo17261gT(9, gA);
        Intent intent = (Intent) C8850c.m23492a(gT, Intent.CREATOR);
        gT.recycle();
        return intent;
    }

    /* renamed from: g */
    public final String mo49496g() {
        Parcel gT = mo17261gT(15, mo17260gA());
        String readString = gT.readString();
        gT.recycle();
        return readString;
    }

    /* renamed from: h */
    public final void mo49497h() {
        mo17263hf(13, mo17260gA());
    }

    /* renamed from: i */
    public final void mo49498i() {
        mo17263hf(14, mo17260gA());
    }

    /* renamed from: j */
    public final void mo49499j(byte[] bArr, byte[] bArr2, byte[] bArr3, C81026c cVar) {
        Parcel gA = mo17260gA();
        gA.writeByteArray(bArr);
        gA.writeByteArray(bArr2);
        gA.writeByteArray(bArr3);
        C8850c.m23499h(gA, cVar);
        mo17263hf(12, gA);
    }

    /* renamed from: k */
    public final void mo49500k(Bundle bundle) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, bundle);
        mo17263hf(11, gA);
    }

    /* renamed from: l */
    public final void mo49501l(Intent intent) {
        throw null;
    }

    /* renamed from: m */
    public final boolean mo49502m(String str, String str2, C45393av avVar) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        gA.writeString(str2);
        C8850c.m23499h(gA, avVar);
        Parcel gT = mo17261gT(1, gA);
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    /* renamed from: n */
    public final boolean mo49503n() {
        Parcel gT = mo17261gT(5, mo17260gA());
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    /* renamed from: o */
    public final boolean mo49504o(String str) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        Parcel gT = mo17261gT(3, gA);
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    /* renamed from: p */
    public final boolean mo49505p() {
        Parcel gT = mo17261gT(4, mo17260gA());
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }
}
