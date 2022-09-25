package com.google.android.apps.gsa.sidekick.shared.util;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7746ik;
import com.google.p375ai.p378b.C7893nw;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.bb */
/* compiled from: PG */
public final class C91978bb {

    /* renamed from: a */
    public static final C59071e f256479a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.shared.util.bb");

    /* renamed from: a */
    public static long m150935a(C7746ik ikVar, long j) {
        return (long) ((int) ((((long) ikVar.f27108J) * 31) + ((long) ((int) (j ^ (j >>> 32))))));
    }

    /* renamed from: b */
    public static C58485gu m150936b(Bundle bundle, String str) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
        if (parcelableArrayList == null) {
            return C58485gu.m89845m();
        }
        ArrayList d = C58597ky.m90213d(parcelableArrayList.size());
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            Parcelable parcelable = (Parcelable) parcelableArrayList.get(i);
            if (!(parcelable instanceof ProtoLiteParcelable)) {
                ((C59052c) ((C59052c) f256479a.mo56226d()).mo56372aa(11946)).mo56389s("Invalid parcelable in %s", str);
            } else {
                try {
                    C7718hj hjVar = (C7718hj) ((ProtoLiteParcelable) parcelable).mo84191d(C7718hj.f26927af.getParserForType());
                    if (hjVar != null) {
                        d.add(hjVar);
                    }
                } catch (IllegalArgumentException e) {
                    ((C59052c) ((C59052c) ((C59052c) f256479a.mo56226d()).mo56382g(e)).mo56372aa(11945)).mo56389s("Invalid entry in %s", str);
                }
            }
        }
        return C58485gu.m89842j(d);
    }

    /* renamed from: c */
    public static C7708h m150937c(C7718hj hjVar, C7681g gVar, C7681g... gVarArr) {
        for (C7708h hVar : hjVar.f26935G) {
            C7681g a = C7681g.m22802a(hVar.f26897b);
            if (a == null) {
                a = C7681g.INVALID;
            }
            if (a == gVar) {
                return hVar;
            }
            if (gVarArr.length != 0) {
                for (int i = 0; i <= 0; i++) {
                    C7681g gVar2 = gVarArr[i];
                    C7681g a2 = C7681g.m22802a(hVar.f26897b);
                    if (a2 == null) {
                        a2 = C7681g.INVALID;
                    }
                    if (a2 == gVar2) {
                        return hVar;
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static String m150938d(C7893nw nwVar) {
        if ((nwVar.f27733a & 512) == 0) {
            return null;
        }
        String str = nwVar.f27743k;
        return str.startsWith("//") ? "https:".concat(String.valueOf(str)) : str;
    }

    /* renamed from: e */
    public static List m150939e(Intent intent, String str) {
        if (intent.getExtras() == null) {
            return Collections.emptyList();
        }
        return m150936b(intent.getExtras(), str);
    }

    /* renamed from: g */
    public static boolean m150941g(C7718hj hjVar, C7718hj hjVar2) {
        if ((hjVar.f26955a & 8) == 0 || (hjVar2.f26955a & 8) == 0) {
            return hjVar.equals(hjVar2);
        }
        return hjVar.f26969j == hjVar2.f26969j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r9.f26969j != r0) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008e, code lost:
        if (r0 == r4.f26891a.mo58927a(0)) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r0 == com.google.p375ai.p378b.C7746ik.PUBLIC_ALERT) goto L_0x00cd;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m150942h(com.google.p375ai.p378b.C7718hj r9, com.google.p375ai.p378b.C7718hj r10) {
        /*
            int r0 = r9.f26966g
            com.google.ai.b.ik r0 = com.google.p375ai.p378b.C7746ik.m22834a(r0)
            if (r0 != 0) goto L_0x000a
            com.google.ai.b.ik r0 = com.google.p375ai.p378b.C7746ik.UNKNOWN
        L_0x000a:
            com.google.ai.b.ik r1 = com.google.p375ai.p378b.C7746ik.PUBLIC_ALERT
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0020
            int r0 = r10.f26966g
            com.google.ai.b.ik r0 = com.google.p375ai.p378b.C7746ik.m22834a(r0)
            if (r0 != 0) goto L_0x001a
            com.google.ai.b.ik r0 = com.google.p375ai.p378b.C7746ik.UNKNOWN
        L_0x001a:
            com.google.ai.b.ik r1 = com.google.p375ai.p378b.C7746ik.PUBLIC_ALERT
            if (r0 != r1) goto L_0x0020
            goto L_0x00cd
        L_0x0020:
            long r0 = r10.f26969j
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0030
            long r4 = r9.f26969j
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x00cd
            goto L_0x00d6
        L_0x0030:
            com.google.ai.b.gy r0 = r9.f26967h
            if (r0 != 0) goto L_0x0036
            com.google.ai.b.gy r0 = com.google.p375ai.p378b.C7706gy.f26889c
        L_0x0036:
            int r0 = r0.f26892b
            com.google.ai.b.gy r1 = r10.f26967h
            if (r1 != 0) goto L_0x003e
            com.google.ai.b.gy r1 = com.google.p375ai.p378b.C7706gy.f26889c
        L_0x003e:
            int r1 = r1.f26892b
            if (r0 != r1) goto L_0x00d6
            int r0 = r9.f26966g
            com.google.ai.b.ik r0 = com.google.p375ai.p378b.C7746ik.m22834a(r0)
            if (r0 != 0) goto L_0x004c
            com.google.ai.b.ik r0 = com.google.p375ai.p378b.C7746ik.UNKNOWN
        L_0x004c:
            int r1 = r10.f26966g
            com.google.ai.b.ik r1 = com.google.p375ai.p378b.C7746ik.m22834a(r1)
            if (r1 != 0) goto L_0x0056
            com.google.ai.b.ik r1 = com.google.p375ai.p378b.C7746ik.UNKNOWN
        L_0x0056:
            if (r0 != r1) goto L_0x00d6
            com.google.ai.b.gy r0 = r9.f26967h
            if (r0 != 0) goto L_0x005e
            com.google.ai.b.gy r0 = com.google.p375ai.p378b.C7706gy.f26889c
        L_0x005e:
            com.google.protobuf.ck r0 = r0.f26891a
            int r0 = r0.size()
            if (r0 != r2) goto L_0x0091
            com.google.ai.b.gy r0 = r10.f26967h
            if (r0 != 0) goto L_0x006c
            com.google.ai.b.gy r0 = com.google.p375ai.p378b.C7706gy.f26889c
        L_0x006c:
            com.google.protobuf.ck r0 = r0.f26891a
            int r0 = r0.size()
            if (r0 != r2) goto L_0x0091
            com.google.ai.b.gy r0 = r9.f26967h
            if (r0 != 0) goto L_0x007a
            com.google.ai.b.gy r0 = com.google.p375ai.p378b.C7706gy.f26889c
        L_0x007a:
            com.google.protobuf.ck r0 = r0.f26891a
            long r0 = r0.mo58927a(r3)
            com.google.ai.b.gy r4 = r10.f26967h
            if (r4 != 0) goto L_0x0086
            com.google.ai.b.gy r4 = com.google.p375ai.p378b.C7706gy.f26889c
        L_0x0086:
            com.google.protobuf.ck r4 = r4.f26891a
            long r4 = r4.mo58927a(r3)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x00d6
            goto L_0x00cd
        L_0x0091:
            com.google.ai.b.gy r0 = r9.f26967h
            if (r0 != 0) goto L_0x0097
            com.google.ai.b.gy r0 = com.google.p375ai.p378b.C7706gy.f26889c
        L_0x0097:
            com.google.protobuf.ck r0 = r0.f26891a
            java.util.Iterator r0 = r0.iterator()
        L_0x009d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00d6
            java.lang.Object r1 = r0.next()
            java.lang.Long r1 = (java.lang.Long) r1
            long r4 = r1.longValue()
            com.google.ai.b.gy r1 = r10.f26967h
            if (r1 != 0) goto L_0x00b3
            com.google.ai.b.gy r1 = com.google.p375ai.p378b.C7706gy.f26889c
        L_0x00b3:
            com.google.protobuf.ck r1 = r1.f26891a
            java.util.Iterator r1 = r1.iterator()
        L_0x00b9:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x009d
            java.lang.Object r6 = r1.next()
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x00b9
        L_0x00cd:
            long r0 = r10.f26970k
            long r9 = r9.f26970k
            int r4 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x00d6
            return r2
        L_0x00d6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.shared.util.C91978bb.m150942h(com.google.ai.b.hj, com.google.ai.b.hj):boolean");
    }

    /* renamed from: f */
    public static void m150940f(Intent intent, String str, Collection collection) {
        collection.getClass();
        C58838bb.m90883r(!collection.isEmpty());
        ArrayList d = C58597ky.m90213d(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            d.add(new ProtoLiteParcelable((MessageLite) (C7718hj) it.next()));
        }
        intent.putParcelableArrayListExtra(str, d);
    }
}
