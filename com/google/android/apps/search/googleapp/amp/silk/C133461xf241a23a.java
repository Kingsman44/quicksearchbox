package com.google.android.apps.search.googleapp.amp.silk;

import com.google.android.apps.search.googleapp.amp.silk.SilkAmpApiImplOpenHelperFragmentPeer;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.apps.search.googleapp.amp.silk.$AutoValue_SilkAmpApiImplOpenHelperFragmentPeer_LoadShouldShowPagesInEmbeddedBrowserAndThenOpenStampViewerCallbackInput */
/* compiled from: PG */
abstract class C133461xf241a23a extends SilkAmpApiImplOpenHelperFragmentPeer.C133464xc5f34d63 {

    /* renamed from: a */
    public final String f363661a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f363662b;

    /* renamed from: c */
    public final ProtoParsers.ParcelableProto f363663c;

    /* renamed from: d */
    public final int f363664d;

    public C133461xf241a23a(int i, String str, ProtoParsers.ParcelableProto parcelableProto, ProtoParsers.ParcelableProto parcelableProto2) {
        this.f363664d = i;
        this.f363661a = str;
        if (parcelableProto != null) {
            this.f363662b = parcelableProto;
            if (parcelableProto2 != null) {
                this.f363663c = parcelableProto2;
                return;
            }
            throw new NullPointerException("Null parcelableClickTimestamp");
        }
        throw new NullPointerException("Null parcelableRequest");
    }

    /* renamed from: a */
    public final ProtoParsers.ParcelableProto mo111167a() {
        return this.f363663c;
    }

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto mo111168b() {
        return this.f363662b;
    }

    /* renamed from: c */
    public final String mo111169c() {
        return this.f363661a;
    }

    /* renamed from: d */
    public final int mo111170d() {
        return this.f363664d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f363661a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.search.googleapp.amp.silk.SilkAmpApiImplOpenHelperFragmentPeer.C133464xc5f34d63
            r2 = 0
            if (r1 == 0) goto L_0x0042
            com.google.android.apps.search.googleapp.amp.silk.SilkAmpApiImplOpenHelperFragmentPeer$LoadShouldShowPagesInEmbeddedBrowserAndThenOpenStampViewerCallbackInput r5 = (com.google.android.apps.search.googleapp.amp.silk.SilkAmpApiImplOpenHelperFragmentPeer.C133464xc5f34d63) r5
            int r1 = r4.f363664d
            int r3 = r5.mo111170d()
            if (r1 != r3) goto L_0x0042
            java.lang.String r1 = r4.f363661a
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = r5.mo111169c()
            if (r1 != 0) goto L_0x0042
            goto L_0x0029
        L_0x001e:
            java.lang.String r3 = r5.mo111169c()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0029
            goto L_0x0042
        L_0x0029:
            com.google.protobuf.contrib.android.ProtoParsers$ParcelableProto r1 = r4.f363662b
            com.google.protobuf.contrib.android.ProtoParsers$ParcelableProto r3 = r5.mo111168b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0042
            com.google.protobuf.contrib.android.ProtoParsers$ParcelableProto r1 = r4.f363663c
            com.google.protobuf.contrib.android.ProtoParsers$ParcelableProto r5 = r5.mo111167a()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0042
            return r0
        L_0x0042:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.amp.silk.C133461xf241a23a.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        int i = this.f363664d;
        String str = this.f363661a;
        String obj = this.f363662b.toString();
        String obj2 = this.f363663c.toString();
        return "LoadShouldShowPagesInEmbeddedBrowserAndThenOpenStampViewerCallbackInput{source=" + C133465a.m216642a(i) + ", persistenceId=" + str + ", parcelableRequest=" + obj + ", parcelableClickTimestamp=" + obj2 + "}";
    }

    public final int hashCode() {
        int i;
        int i2 = (this.f363664d ^ 1000003) * 1000003;
        String str = this.f363661a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return ((((i2 ^ i) * 1000003) ^ this.f363662b.hashCode()) * 1000003) ^ this.f363663c.hashCode();
    }
}
