package com.google.android.gms.usonia.p10878b;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143773bu;
import com.google.android.gms.usonia.auth.internal.C146133f;
import com.google.android.gms.usonia.auth.internal.C146135h;
import com.google.android.gms.usonia.auth.internal.CheckIsServiceAllowedParams;
import com.google.android.gms.usonia.auth.internal.RegisterStructureInfoCallbackParams;
import com.google.android.gms.usonia.auth.internal.SignAppCertificateParams;
import com.google.android.gms.usonia.auth.internal.UnregisterStructureInfoCallbackParams;
import com.google.android.gms.usonia.directory.internal.FetchAllPeerAddressesParams;
import com.google.android.gms.usonia.directory.internal.RegisterDistributedServiceAvailabilityCallbackParams;
import com.google.android.gms.usonia.directory.internal.RegisterServiceParams;
import com.google.android.gms.usonia.directory.internal.RegisterStateCallbackParams;
import com.google.android.gms.usonia.directory.internal.ResolvePeerAddressParams;
import com.google.android.gms.usonia.directory.internal.SetStateParams;
import com.google.android.gms.usonia.directory.internal.UnregisterDistributedServiceAvailabilityCallbackParams;
import com.google.android.gms.usonia.directory.internal.UnregisterStateCallbackParams;
import com.google.android.gms.usonia.iam.internal.MayAccessServiceOnPeerParams;
import com.google.android.gms.usonia.iam.internal.MayPeerAccessServiceParams;
import com.google.android.gms.usonia.metrics.internal.ProtoSafeParcelable;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.usonia.b.a */
/* compiled from: PG */
public final class C146155a extends C8848a implements C146156b {
    public C146155a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.usonia.internal.IUsoniaService");
    }

    /* renamed from: e */
    public final void mo122708e(C146133f fVar, CheckIsServiceAllowedParams checkIsServiceAllowedParams) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, fVar);
        C8850c.m23497f(gA, checkIsServiceAllowedParams);
        mo17263hf(10, gA);
    }

    /* renamed from: f */
    public final void mo122709f(FetchAllPeerAddressesParams fetchAllPeerAddressesParams) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, fetchAllPeerAddressesParams);
        mo17263hf(13, gA);
    }

    /* renamed from: g */
    public final void mo122710g(ProtoSafeParcelable protoSafeParcelable, C143773bu buVar) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, protoSafeParcelable);
        C8850c.m23499h(gA, buVar);
        mo17263hf(7, gA);
    }

    /* renamed from: h */
    public final void mo122711h(C143773bu buVar, MayAccessServiceOnPeerParams mayAccessServiceOnPeerParams) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, buVar);
        C8850c.m23497f(gA, mayAccessServiceOnPeerParams);
        mo17263hf(20, gA);
    }

    /* renamed from: i */
    public final void mo122712i(C143773bu buVar, MayPeerAccessServiceParams mayPeerAccessServiceParams) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, buVar);
        C8850c.m23497f(gA, mayPeerAccessServiceParams);
        mo17263hf(19, gA);
    }

    /* renamed from: j */
    public final void mo122713j(RegisterStateCallbackParams registerStateCallbackParams) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, registerStateCallbackParams);
        mo17263hf(2, gA);
    }

    /* renamed from: k */
    public final void mo122714k(RegisterDistributedServiceAvailabilityCallbackParams registerDistributedServiceAvailabilityCallbackParams) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, registerDistributedServiceAvailabilityCallbackParams);
        mo17263hf(4, gA);
    }

    /* renamed from: l */
    public final void mo122715l(RegisterServiceParams registerServiceParams) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, registerServiceParams);
        mo17263hf(12, gA);
    }

    /* renamed from: m */
    public final void mo122716m(RegisterStructureInfoCallbackParams registerStructureInfoCallbackParams) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, registerStructureInfoCallbackParams);
        mo17263hf(14, gA);
    }

    /* renamed from: n */
    public final void mo122717n(ResolvePeerAddressParams resolvePeerAddressParams) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, resolvePeerAddressParams);
        mo17263hf(11, gA);
    }

    /* renamed from: o */
    public final void mo122718o(SetStateParams setStateParams) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, setStateParams);
        mo17263hf(18, gA);
    }

    /* renamed from: p */
    public final void mo122719p(C146135h hVar, SignAppCertificateParams signAppCertificateParams) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, hVar);
        C8850c.m23497f(gA, signAppCertificateParams);
        mo17263hf(6, gA);
    }

    /* renamed from: q */
    public final void mo122720q(UnregisterStateCallbackParams unregisterStateCallbackParams) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, unregisterStateCallbackParams);
        mo17263hf(3, gA);
    }

    /* renamed from: r */
    public final void mo122721r(UnregisterDistributedServiceAvailabilityCallbackParams unregisterDistributedServiceAvailabilityCallbackParams) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, unregisterDistributedServiceAvailabilityCallbackParams);
        mo17263hf(5, gA);
    }

    /* renamed from: s */
    public final void mo122722s(UnregisterStructureInfoCallbackParams unregisterStructureInfoCallbackParams) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, unregisterStructureInfoCallbackParams);
        mo17263hf(15, gA);
    }
}
