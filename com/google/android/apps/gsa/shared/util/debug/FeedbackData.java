package com.google.android.apps.gsa.shared.util.debug;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.proto.p7126io.LargeProtoParcelable;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.C91089t;
import com.google.android.libraries.gsa.util.C23338c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59796fx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C62995dn;
import com.google.protobuf.MessageLite;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
public class FeedbackData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C91023g();

    /* renamed from: h */
    private static final C59071e f254174h = C59071e.m91332i("com.google.android.apps.gsa.shared.util.debug.FeedbackData");

    /* renamed from: a */
    public final String f254175a;

    /* renamed from: b */
    public final C59796fx f254176b;

    /* renamed from: c */
    public String f254177c;

    /* renamed from: d */
    public Bitmap f254178d;

    /* renamed from: e */
    public final Map f254179e;

    /* renamed from: f */
    public String f254180f;

    /* renamed from: g */
    public final Map f254181g;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0087, code lost:
        if (r0 == null) goto L_0x0098;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029 A[Catch:{ RemoteException | ct -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007b A[SYNTHETIC, Splitter:B:18:0x007b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FeedbackData(android.os.Parcel r6) {
        /*
            r5 = this;
            java.lang.String r0 = "Exception while reading from parcel"
            r5.<init>()
            r1 = 0
            byte[] r2 = com.google.android.libraries.gsa.util.C23338c.m43773e(r6)     // Catch:{ RemoteException -> 0x0014 }
            if (r2 == 0) goto L_0x0020
            java.lang.String r3 = new java.lang.String     // Catch:{ RemoteException -> 0x0014 }
            java.nio.charset.Charset r4 = com.google.android.apps.gsa.shared.util.C90772bp.f253863a     // Catch:{ RemoteException -> 0x0014 }
            r3.<init>(r2, r4)     // Catch:{ RemoteException -> 0x0014 }
            goto L_0x0021
        L_0x0014:
            r2 = move-exception
            com.google.common.f.e r3 = f254174h
            com.google.common.f.x r3 = r3.mo56225c()
            r4 = 11394(0x2c82, float:1.5966E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r2)).mo56372aa(r4)).mo56386p(r0)
        L_0x0020:
            r3 = r1
        L_0x0021:
            r5.f254175a = r3
            byte[] r2 = com.google.android.libraries.gsa.util.C23338c.m43773e(r6)     // Catch:{ RemoteException -> 0x0039, ct -> 0x0037 }
            if (r2 == 0) goto L_0x0045
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ RemoteException -> 0x0039, ct -> 0x0037 }
            com.google.common.o.fx r4 = com.google.common.p4552o.C59796fx.f161580r     // Catch:{ RemoteException -> 0x0039, ct -> 0x0037 }
            com.google.protobuf.bv r2 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (byte[]) r2, (com.google.protobuf.C62921ba) r3)     // Catch:{ RemoteException -> 0x0039, ct -> 0x0037 }
            com.google.common.o.fx r2 = (com.google.common.p4552o.C59796fx) r2     // Catch:{ RemoteException -> 0x0039, ct -> 0x0037 }
            r1 = r2
            goto L_0x0045
        L_0x0037:
            r2 = move-exception
            goto L_0x003a
        L_0x0039:
            r2 = move-exception
        L_0x003a:
            com.google.common.f.e r3 = f254174h
            com.google.common.f.x r3 = r3.mo56225c()
            r4 = 11393(0x2c81, float:1.5965E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r2)).mo56372aa(r4)).mo56386p(r0)
        L_0x0045:
            r5.f254176b = r1
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r6.readParcelable(r0)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r5.f254178d = r0
            java.lang.Class r0 = r5.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Bundle r0 = r6.readBundle(r0)
            java.util.Map r0 = com.google.android.apps.gsa.shared.util.C90772bp.m148314v(r0)
            r5.f254179e = r0
            java.lang.String r0 = r6.readString()
            r5.f254177c = r0
            java.lang.Class<com.google.android.apps.gsa.shared.proto.io.LargeProtoParcelable> r0 = com.google.android.apps.gsa.shared.proto.p7126io.LargeProtoParcelable.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r6.readParcelable(r0)
            com.google.android.apps.gsa.shared.proto.io.LargeProtoParcelable r0 = (com.google.android.apps.gsa.shared.proto.p7126io.LargeProtoParcelable) r0
            if (r0 == 0) goto L_0x0098
            com.google.android.apps.gsa.shared.util.debug.c r1 = com.google.android.apps.gsa.shared.util.debug.C91019c.f254257b     // Catch:{ IllegalArgumentException -> 0x008a }
            com.google.protobuf.eb r1 = r1.getParserForType()     // Catch:{ IllegalArgumentException -> 0x008a }
            com.google.protobuf.MessageLite r0 = r0.mo84185a(r1)     // Catch:{ IllegalArgumentException -> 0x008a }
            com.google.android.apps.gsa.shared.util.debug.c r0 = (com.google.android.apps.gsa.shared.util.debug.C91019c) r0     // Catch:{ IllegalArgumentException -> 0x008a }
            if (r0 != 0) goto L_0x009a
            goto L_0x0098
        L_0x008a:
            r0 = move-exception
            com.google.common.f.e r1 = f254174h
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r2 = "Exception while reading AdditionalFeedbackData from parcel"
            r3 = 11392(0x2c80, float:1.5964E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
        L_0x0098:
            com.google.android.apps.gsa.shared.util.debug.c r0 = com.google.android.apps.gsa.shared.util.debug.C91019c.f254257b
        L_0x009a:
            com.google.protobuf.dn r0 = r0.f254259a
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            r5.f254181g = r0
            java.lang.String r6 = r6.readString()
            r5.f254180f = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.util.debug.FeedbackData.<init>(android.os.Parcel):void");
    }

    /* renamed from: b */
    public static FeedbackData m148578b(Cursor cursor, Map map, Map map2, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (map == null) {
            map = new LinkedHashMap();
        }
        linkedHashMap.putAll(map);
        if (map2 == null) {
            map2 = new LinkedHashMap();
        }
        linkedHashMap2.putAll(map2);
        String str2 = null;
        StringBuilder sb = null;
        C59796fx fxVar = null;
        while (cursor.moveToNext()) {
            try {
                String a = C91089t.m148812a(cursor, "key");
                int i = cursor.getInt(cursor.getColumnIndexOrThrow("type"));
                if (i == 1) {
                    linkedHashMap.put(a, C91089t.m148812a(cursor, "value"));
                } else if (i == 2) {
                    linkedHashMap2.put(a, C91089t.m148812a(cursor, "value"));
                } else if (i == 3) {
                    if (str == null) {
                        sb = new StringBuilder();
                    } else {
                        sb = new StringBuilder(str);
                        sb.append("\n");
                    }
                    sb.append(C91089t.m148812a(cursor, "value"));
                } else if (i == 4) {
                    try {
                        fxVar = (C59796fx) C62942bv.parseFrom((C62942bv) C59796fx.f161580r, cursor.getBlob(cursor.getColumnIndexOrThrow("value")), C62921ba.m95368a());
                    } catch (C62974ct unused) {
                        fxVar = null;
                    }
                }
            } finally {
                cursor.close();
            }
        }
        if (sb != null) {
            str2 = sb.toString();
        }
        return new FeedbackData(str2, fxVar, linkedHashMap, linkedHashMap2);
    }

    /* renamed from: a */
    public final Cursor mo85252a() {
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"key", "value", "type"});
        for (Map.Entry entry : this.f254179e.entrySet()) {
            matrixCursor.addRow(new Object[]{entry.getKey(), entry.getValue(), 1});
        }
        for (Map.Entry entry2 : this.f254181g.entrySet()) {
            matrixCursor.addRow(new Object[]{entry2.getKey(), entry2.getValue(), 2});
        }
        String str = this.f254175a;
        if (str != null) {
            matrixCursor.addRow(new Object[]{"state_dump", str, 3});
        }
        C59796fx fxVar = this.f254176b;
        if (fxVar != null) {
            matrixCursor.addRow(new Object[]{"state_dump_proto", fxVar.toByteArray(), 4});
        }
        return matrixCursor;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f254175a;
        if (str == null) {
            C23338c.m43770b(parcel, (byte[]) null);
        } else {
            C23338c.m43770b(parcel, str.getBytes(C90772bp.f253863a));
        }
        C59796fx fxVar = this.f254176b;
        if (fxVar == null) {
            C23338c.m43770b(parcel, (byte[]) null);
        } else {
            C23338c.m43770b(parcel, fxVar.toByteArray());
        }
        parcel.writeParcelable(this.f254178d, 0);
        parcel.writeBundle(C90772bp.m148300h(this.f254179e));
        parcel.writeString(this.f254177c);
        C90963a aVar = (C90963a) C91019c.f254257b.createBuilder();
        Map map = this.f254181g;
        aVar.copyOnWrite();
        C91019c cVar = (C91019c) aVar.instance;
        C62995dn dnVar = cVar.f254259a;
        if (!dnVar.f170058b) {
            cVar.f254259a = dnVar.mo58980a();
        }
        cVar.f254259a.putAll(map);
        parcel.writeParcelable(new LargeProtoParcelable((MessageLite) (C91019c) aVar.build()), 0);
        parcel.writeString(this.f254180f);
    }

    public FeedbackData(String str, C59796fx fxVar, Map map, Map map2) {
        this.f254175a = str;
        this.f254176b = fxVar;
        this.f254179e = map == null ? new LinkedHashMap() : map;
        this.f254181g = map2 == null ? new LinkedHashMap() : map2;
    }
}
