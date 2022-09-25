package com.google.android.libraries.search.rendering.xuikit.p3131d.p3140i;

import com.google.android.libraries.elements.interfaces.PublicKeyVerifier;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.i.d */
/* compiled from: PG */
public final class C40439d extends PublicKeyVerifier {
    public final Status initialize(String str, byte[] bArr, byte[] bArr2) {
        C69664n.m101061g(str, "rootCertIdentifier");
        C69664n.m101061g(bArr, "rootCertBytes");
        C69664n.m101061g(bArr2, "intermediateCertBytes");
        return Status.f186905c;
    }

    public final Status verify(byte[] bArr, byte[] bArr2) {
        C69664n.m101061g(bArr, "signature");
        C69664n.m101061g(bArr2, "body");
        return Status.f186905c;
    }
}
