package com.google.android.gms.usonia.p10878b;

import android.os.IInterface;
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

/* renamed from: com.google.android.gms.usonia.b.b */
/* compiled from: PG */
public interface C146156b extends IInterface {
    /* renamed from: e */
    void mo122708e(C146133f fVar, CheckIsServiceAllowedParams checkIsServiceAllowedParams);

    /* renamed from: f */
    void mo122709f(FetchAllPeerAddressesParams fetchAllPeerAddressesParams);

    /* renamed from: g */
    void mo122710g(ProtoSafeParcelable protoSafeParcelable, C143773bu buVar);

    /* renamed from: h */
    void mo122711h(C143773bu buVar, MayAccessServiceOnPeerParams mayAccessServiceOnPeerParams);

    /* renamed from: i */
    void mo122712i(C143773bu buVar, MayPeerAccessServiceParams mayPeerAccessServiceParams);

    /* renamed from: j */
    void mo122713j(RegisterStateCallbackParams registerStateCallbackParams);

    /* renamed from: k */
    void mo122714k(RegisterDistributedServiceAvailabilityCallbackParams registerDistributedServiceAvailabilityCallbackParams);

    /* renamed from: l */
    void mo122715l(RegisterServiceParams registerServiceParams);

    /* renamed from: m */
    void mo122716m(RegisterStructureInfoCallbackParams registerStructureInfoCallbackParams);

    /* renamed from: n */
    void mo122717n(ResolvePeerAddressParams resolvePeerAddressParams);

    /* renamed from: o */
    void mo122718o(SetStateParams setStateParams);

    /* renamed from: p */
    void mo122719p(C146135h hVar, SignAppCertificateParams signAppCertificateParams);

    /* renamed from: q */
    void mo122720q(UnregisterStateCallbackParams unregisterStateCallbackParams);

    /* renamed from: r */
    void mo122721r(UnregisterDistributedServiceAvailabilityCallbackParams unregisterDistributedServiceAvailabilityCallbackParams);

    /* renamed from: s */
    void mo122722s(UnregisterStructureInfoCallbackParams unregisterStructureInfoCallbackParams);
}
