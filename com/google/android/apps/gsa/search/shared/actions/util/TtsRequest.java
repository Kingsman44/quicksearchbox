package com.google.android.apps.gsa.search.shared.actions.util;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.common.base.C58832aw;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5224k.p5225a.C67190ah;
import com.google.speech.p5224k.p5225a.C67215bf;
import com.google.speech.p5230n.p5232b.C67402ar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public class TtsRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C87499u();

    /* renamed from: a */
    final List f236277a;

    /* renamed from: b */
    public final C67402ar f236278b;

    /* renamed from: c */
    public final Uri f236279c;

    /* renamed from: d */
    public final C67190ah f236280d;

    /* renamed from: e */
    public boolean f236281e;

    /* renamed from: f */
    public boolean f236282f;

    /* renamed from: g */
    public boolean f236283g;

    /* renamed from: h */
    public String f236284h;

    /* renamed from: i */
    public String f236285i;

    /* renamed from: j */
    public String f236286j;

    /* renamed from: k */
    public final boolean f236287k;

    public TtsRequest(Parcel parcel) {
        Uri uri;
        boolean z = false;
        this.f236281e = false;
        this.f236282f = false;
        this.f236281e = parcel.readByte() == 1;
        this.f236287k = parcel.readByte() == 1;
        this.f236282f = parcel.readByte() == 1;
        this.f236283g = parcel.readByte() == 1 ? true : z;
        ArrayList arrayList = new ArrayList();
        this.f236277a = arrayList;
        parcel.readList(arrayList, getClass().getClassLoader());
        this.f236278b = (C67402ar) ProtoLiteParcelable.m147134e(parcel.createByteArray(), C67402ar.f183192d.getParserForType());
        String readString = parcel.readString();
        if (readString == null) {
            uri = null;
        } else {
            uri = Uri.parse(readString);
        }
        this.f236279c = uri;
        this.f236280d = (C67190ah) ProtoLiteParcelable.m147134e(parcel.createByteArray(), C67190ah.f182619q.getParserForType());
    }

    public TtsRequest(C67190ah ahVar, List list, C67402ar arVar, Uri uri, boolean z) {
        this.f236281e = false;
        this.f236282f = false;
        this.f236280d = ahVar;
        this.f236277a = list;
        this.f236278b = arVar;
        this.f236279c = uri;
        this.f236287k = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0080 A[ADDED_TO_REGION] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m141979c(com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r8) {
        /*
            r0 = 1
            if (r8 == 0) goto L_0x008e
            java.util.List r1 = r8.f236277a
            r2 = 0
            if (r1 == 0) goto L_0x0014
            java.lang.String r1 = r8.toString()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0014
            r1 = 1
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            com.google.speech.n.b.ar r3 = r8.f236278b
            if (r3 == 0) goto L_0x0023
            com.google.protobuf.cq r3 = r3.f183195b
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0023
            r3 = 1
            goto L_0x0024
        L_0x0023:
            r3 = 0
        L_0x0024:
            com.google.speech.n.b.ar r4 = r8.f236278b
            if (r4 == 0) goto L_0x003d
            int r5 = r4.f183194a
            r5 = r5 & r0
            if (r5 == 0) goto L_0x003d
            com.google.speech.n.a.i r4 = r4.f183196c
            if (r4 != 0) goto L_0x0033
            com.google.speech.n.a.i r4 = com.google.speech.p5230n.p5231a.C67372i.f183129b
        L_0x0033:
            com.google.protobuf.cq r4 = r4.f183131a
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x003d
            r4 = 1
            goto L_0x003e
        L_0x003d:
            r4 = 0
        L_0x003e:
            com.google.speech.n.b.ar r5 = r8.f236278b
            if (r5 == 0) goto L_0x007d
            com.google.protobuf.bt r6 = com.google.speech.p5224k.p5225a.C67215bf.f182681c
            com.google.protobuf.bt r6 = com.google.protobuf.C62942bv.checkIsLite(r6)
            r5.mo58887l(r6)
            com.google.protobuf.bf r5 = r5.f169962ag
            com.google.protobuf.bs r6 = r6.f169971d
            boolean r5 = r5.mo58857o(r6)
            if (r5 == 0) goto L_0x007d
            com.google.speech.n.b.ar r5 = r8.f236278b
            com.google.protobuf.bt r6 = com.google.speech.p5224k.p5225a.C67215bf.f182681c
            com.google.protobuf.bt r6 = com.google.protobuf.C62942bv.checkIsLite(r6)
            r5.mo58887l(r6)
            com.google.protobuf.bf r5 = r5.f169962ag
            com.google.protobuf.bs r7 = r6.f169971d
            java.lang.Object r5 = r5.mo58854l(r7)
            if (r5 != 0) goto L_0x006d
            java.lang.Object r5 = r6.f169969b
            goto L_0x0071
        L_0x006d:
            java.lang.Object r5 = r6.mo58889c(r5)
        L_0x0071:
            com.google.speech.k.a.bf r5 = (com.google.speech.p5224k.p5225a.C67215bf) r5
            com.google.protobuf.cq r5 = r5.f182683a
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x007d
            r5 = 1
            goto L_0x007e
        L_0x007d:
            r5 = 0
        L_0x007e:
            if (r1 != 0) goto L_0x008d
            if (r3 != 0) goto L_0x008d
            if (r4 != 0) goto L_0x008d
            if (r5 != 0) goto L_0x008d
            boolean r8 = r8.mo81451b()
            if (r8 != 0) goto L_0x008d
            return r0
        L_0x008d:
            return r2
        L_0x008e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.util.TtsRequest.m141979c(com.google.android.apps.gsa.search.shared.actions.util.TtsRequest):boolean");
    }

    /* renamed from: a */
    public final List mo81450a() {
        List list = this.f236277a;
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: b */
    public final boolean mo81451b() {
        return this.f236279c != null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TtsRequest)) {
            return false;
        }
        TtsRequest ttsRequest = (TtsRequest) obj;
        C67402ar arVar = this.f236278b;
        return arVar != null ? arVar.equals(ttsRequest.f236278b) && this.f236281e == ttsRequest.f236281e : C58832aw.m90831a(this.f236277a, ttsRequest.f236277a) && this.f236281e == ttsRequest.f236281e;
    }

    public final int hashCode() {
        List list = this.f236277a;
        return list == null ? super.hashCode() : list.hashCode();
    }

    public final String toString() {
        Object obj;
        List list = this.f236277a;
        if (list != null) {
            return TextUtils.join(" ", list);
        }
        C67402ar arVar = this.f236278b;
        if (arVar == null) {
            return BuildConfig.FLAVOR;
        }
        C62940bt r1 = C62942bv.checkIsLite(C67215bf.f182681c);
        arVar.mo58887l(r1);
        if (!arVar.f169962ag.mo58857o(r1.f169971d)) {
            return this.f236278b.toString();
        }
        C67402ar arVar2 = this.f236278b;
        C62940bt r12 = C62942bv.checkIsLite(C67215bf.f182681c);
        arVar2.mo58887l(r12);
        Object l = arVar2.f169962ag.mo58854l(r12.f169971d);
        if (l == null) {
            obj = r12.f169969b;
        } else {
            obj = r12.mo58889c(l);
        }
        return ((C67215bf) obj).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f236281e ? (byte) 1 : 0);
        parcel.writeByte(this.f236287k ? (byte) 1 : 0);
        parcel.writeByte(this.f236282f ? (byte) 1 : 0);
        parcel.writeByte(this.f236283g ? (byte) 1 : 0);
        parcel.writeList(this.f236277a);
        ProtoLiteParcelable.m147140k(this.f236278b, parcel);
        Uri uri = this.f236279c;
        parcel.writeString(uri != null ? uri.toString() : null);
        ProtoLiteParcelable.m147140k(this.f236280d, parcel);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TtsRequest(C67190ah ahVar, String str) {
        this(ahVar, TextUtils.isEmpty(str) ? null : Collections.singletonList(str), (C67402ar) null, (Uri) null, false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TtsRequest(String str, boolean z) {
        this((C67190ah) null, TextUtils.isEmpty(str) ? null : Collections.singletonList(str), (C67402ar) null, (Uri) null, z);
    }
}
