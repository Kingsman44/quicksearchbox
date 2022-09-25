package com.google.android.libraries.p10922ab;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.view.WindowManager;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.libraries.ab.a */
/* compiled from: PG */
public final class C146705a extends C8848a implements C146707c {
    public C146705a(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.launcherclient.ILauncherOverlay");
    }

    /* renamed from: A */
    public final void mo28072A(Bundle bundle) {
        throw null;
    }

    /* renamed from: C */
    public final void mo28073C(WindowManager.LayoutParams layoutParams, C146710f fVar, int i) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, layoutParams);
        C8850c.m23499h(gA, fVar);
        gA.writeInt(i);
        mo17263hf(4, gA);
    }

    /* renamed from: D */
    public final void mo28074D(Bundle bundle, C146710f fVar) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, bundle);
        C8850c.m23499h(gA, fVar);
        mo17263hf(14, gA);
    }

    /* renamed from: F */
    public final void mo28075F(boolean z) {
        Parcel gA = mo17260gA();
        C8850c.m23495d(gA, z);
        mo17263hf(5, gA);
    }

    /* renamed from: G */
    public final boolean mo28076G() {
        Parcel gT = mo17261gT(13, mo17260gA());
        boolean i = C8850c.m23500i(gT);
        gT.recycle();
        return i;
    }

    /* renamed from: I */
    public final boolean mo28077I() {
        throw null;
    }

    /* renamed from: J */
    public final boolean mo28078J(byte[] bArr, Bundle bundle) {
        throw null;
    }

    /* renamed from: e */
    public final String mo28081e() {
        throw null;
    }

    /* renamed from: f */
    public final void mo28082f(int i) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        mo17263hf(6, gA);
    }

    /* renamed from: g */
    public final void mo28083g(Bundle bundle) {
        throw null;
    }

    /* renamed from: i */
    public final void mo28084i() {
        mo17263hf(3, mo17260gA());
    }

    /* renamed from: m */
    public final void mo28085m() {
        mo17263hf(7, mo17260gA());
    }

    /* renamed from: n */
    public final void mo28086n() {
        mo17263hf(8, mo17260gA());
    }

    /* renamed from: o */
    public final void mo28087o(float f) {
        Parcel gA = mo17260gA();
        gA.writeFloat(f);
        mo17263hf(2, gA);
    }

    /* renamed from: p */
    public final void mo28088p(int i) {
        throw null;
    }

    /* renamed from: q */
    public final void mo28089q(Bundle bundle) {
        throw null;
    }

    /* renamed from: t */
    public final void mo28091t(boolean z) {
        throw null;
    }

    /* renamed from: u */
    public final void mo28092u(int i) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        mo17263hf(16, gA);
    }

    /* renamed from: z */
    public final void mo28093z() {
        mo17263hf(1, mo17260gA());
    }
}
