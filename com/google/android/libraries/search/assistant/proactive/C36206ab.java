package com.google.android.libraries.search.assistant.proactive;

import android.content.Intent;
import android.os.Parcel;
import android.service.notification.StatusBarNotification;
import android.util.Base64;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.logging.C28257a;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28294l;
import com.google.android.libraries.logging.p2185ve.synthetic.remote.ParcelableSyntheticTree;
import com.google.assistant.p3897e.p3921j.aap;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.ajz;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4552o.p4566l.C60217q;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4816ai.p4818b.C63204j;
import java.io.IOException;

/* renamed from: com.google.android.libraries.search.assistant.proactive.ab */
/* compiled from: PG */
public final class C36206ab {

    /* renamed from: a */
    private static final C59071e f94593a = C59071e.m91332i("com.google.android.libraries.search.assistant.proactive.ab");

    /* renamed from: a */
    public static ParcelableSyntheticTree m64605a(String str) {
        byte[] decode = Base64.decode(str, 11);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
        return (ParcelableSyntheticTree) ParcelableSyntheticTree.CREATOR.createFromParcel(obtain);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.p4552o.ajw m64606b(com.google.assistant.p3897e.p3921j.aas r8) {
        /*
            com.google.common.o.ajz r0 = com.google.common.p4552o.ajz.f158928q
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.common.o.ajw r0 = (com.google.common.p4552o.ajw) r0
            java.lang.String r1 = r8.f134670h
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.common.o.ajz r2 = (com.google.common.p4552o.ajz) r2
            r1.getClass()
            int r3 = r2.f158932a
            r4 = 1
            r3 = r3 | r4
            r2.f158932a = r3
            r2.f158933b = r1
            com.google.assistant.e.j.aap r1 = r8.f134676n
            if (r1 != 0) goto L_0x0022
            com.google.assistant.e.j.aap r1 = com.google.assistant.p3897e.p3921j.aap.f134650h
        L_0x0022:
            int r1 = r1.f134653b
            if (r1 <= 0) goto L_0x003d
            com.google.assistant.e.j.aap r1 = r8.f134676n
            if (r1 != 0) goto L_0x002c
            com.google.assistant.e.j.aap r1 = com.google.assistant.p3897e.p3921j.aap.f134650h
        L_0x002c:
            int r1 = r1.f134653b
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.common.o.ajz r2 = (com.google.common.p4552o.ajz) r2
            int r3 = r2.f158932a
            r3 = r3 | 8
            r2.f158932a = r3
            r2.f158936e = r1
        L_0x003d:
            com.google.assistant.e.j.aap r1 = r8.f134676n
            if (r1 != 0) goto L_0x0044
            com.google.assistant.e.j.aap r2 = com.google.assistant.p3897e.p3921j.aap.f134650h
            goto L_0x0045
        L_0x0044:
            r2 = r1
        L_0x0045:
            int r2 = r2.f134655d
            if (r2 <= 0) goto L_0x005e
            if (r1 != 0) goto L_0x004d
            com.google.assistant.e.j.aap r1 = com.google.assistant.p3897e.p3921j.aap.f134650h
        L_0x004d:
            int r1 = r1.f134655d
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.common.o.ajz r2 = (com.google.common.p4552o.ajz) r2
            int r3 = r2.f158932a
            r3 = r3 | 16
            r2.f158932a = r3
            r2.f158937f = r1
        L_0x005e:
            com.google.assistant.e.j.aap r1 = r8.f134676n
            if (r1 != 0) goto L_0x0065
            com.google.assistant.e.j.aap r2 = com.google.assistant.p3897e.p3921j.aap.f134650h
            goto L_0x0066
        L_0x0065:
            r2 = r1
        L_0x0066:
            long r2 = r2.f134654c
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0083
            if (r1 != 0) goto L_0x0072
            com.google.assistant.e.j.aap r1 = com.google.assistant.p3897e.p3921j.aap.f134650h
        L_0x0072:
            long r1 = r1.f134654c
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.common.o.ajz r3 = (com.google.common.p4552o.ajz) r3
            int r5 = r3.f158932a
            r5 = r5 | 32
            r3.f158932a = r5
            r3.f158938g = r1
        L_0x0083:
            com.google.protobuf.bt r1 = com.google.assistant.p3897e.p3921j.abc.f134692p
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r8.mo58887l(r1)
            com.google.protobuf.bf r2 = r8.f169962ag
            com.google.protobuf.bs r3 = r1.f169971d
            java.lang.Object r2 = r2.mo58854l(r3)
            if (r2 != 0) goto L_0x0099
            java.lang.Object r1 = r1.f169969b
            goto L_0x009d
        L_0x0099:
            java.lang.Object r1 = r1.mo58889c(r2)
        L_0x009d:
            com.google.assistant.e.j.abc r1 = (com.google.assistant.p3897e.p3921j.abc) r1
            com.google.aq.a.a.u r1 = r1.f134698e
            if (r1 != 0) goto L_0x00a5
            com.google.aq.a.a.u r1 = com.google.p3717aq.p3718a.p3719a.C47887u.f123976l
        L_0x00a5:
            int r2 = r1.f123978a
            java.lang.String r3 = ""
            if (r2 != r4) goto L_0x00b0
            java.lang.Object r2 = r1.f123979b
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x00b1
        L_0x00b0:
            r2 = r3
        L_0x00b1:
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.common.o.ajz r4 = (com.google.common.p4552o.ajz) r4
            r2.getClass()
            int r5 = r4.f158932a
            r5 = r5 | 128(0x80, float:1.794E-43)
            r4.f158932a = r5
            r4.f158940i = r2
            int r2 = r1.f123980c
            r4 = 7
            if (r2 != r4) goto L_0x00cd
            java.lang.Object r1 = r1.f123981d
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
        L_0x00cd:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.common.o.ajz r1 = (com.google.common.p4552o.ajz) r1
            r3.getClass()
            int r2 = r1.f158932a
            r2 = r2 | 256(0x100, float:3.59E-43)
            r1.f158932a = r2
            r1.f158941j = r3
            com.google.assistant.e.j.aap r8 = r8.f134676n
            if (r8 != 0) goto L_0x00e5
            com.google.assistant.e.j.aap r8 = com.google.assistant.p3897e.p3921j.aap.f134650h
        L_0x00e5:
            com.google.protobuf.ch r8 = r8.f134656e
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.common.o.ajz r1 = (com.google.common.p4552o.ajz) r1
            com.google.protobuf.ch r2 = r1.f158943l
            boolean r3 = r2.mo58948c()
            if (r3 != 0) goto L_0x00fc
            com.google.protobuf.ch r2 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r2)
            r1.f158943l = r2
        L_0x00fc:
            com.google.protobuf.ch r1 = r1.f158943l
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r8, (java.util.List) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.proactive.C36206ab.m64606b(com.google.assistant.e.j.aas):com.google.common.o.ajw");
    }

    /* renamed from: c */
    public static ajz m64607c(Intent intent) {
        try {
            byte[] byteArrayExtra = intent.getByteArrayExtra("notification-logging-metadata");
            if (byteArrayExtra == null) {
                return null;
            }
            return (ajz) C62942bv.parseFrom((C62942bv) ajz.f158928q, byteArrayExtra, C62921ba.m95368a());
        } catch (C62974ct e) {
            C59104x c = f94593a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NotificationLogging");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(52233)).mo56386p("Unable to parse OpaNotification logging metadata from notification intent.");
            return null;
        }
    }

    /* renamed from: d */
    public static String m64608d(C28293k kVar, int i) {
        C60214n g;
        C28257a aVar = (C28257a) kVar;
        if (i >= aVar.f76909b.size()) {
            C59104x b = f94593a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "NotificationLogging");
            ((C59052c) ((C59052c) b).mo56372aa(52236)).mo56393w("Requested VED for a non-existent child element. Elements count: %d, requested childIndex: %d", aVar.f76909b.size(), i);
            return BuildConfig.FLAVOR;
        }
        C28292j a = ((C28293k) aVar.f76909b.get(i)).mo33745a();
        if (a == null || (g = C28285c.m52880g(a)) == null) {
            return BuildConfig.FLAVOR;
        }
        String c = C28294l.m52913c(g);
        C58976aa aaVar = C58975e.f156826a;
        return c;
    }

    /* renamed from: e */
    public static String m64609e(ParcelableSyntheticTree parcelableSyntheticTree) {
        Parcel obtain = Parcel.obtain();
        parcelableSyntheticTree.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return Base64.encodeToString(marshall, 11);
    }

    /* renamed from: f */
    public static boolean m64610f(C36221aq aqVar, int i) {
        StatusBarNotification[] j = aqVar.mo40038j();
        if (j == null) {
            return false;
        }
        for (StatusBarNotification statusBarNotification : j) {
            if ("oc".equals(statusBarNotification.getTag()) && statusBarNotification.getId() == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static C60321oe m64611g(int i, C28293k kVar, aas aas) {
        C60321oe b = C28285c.m52875b(kVar, i);
        if (b == null || b.f163228c.isEmpty()) {
            return C60321oe.f163224i;
        }
        C60320od odVar = (C60320od) b.toBuilder();
        if (!aas.f134675m.isEmpty()) {
            try {
                C60217q qVar = (C60217q) C60218r.f162925d.createBuilder();
                C60220t b2 = C28294l.m52912b(aas.f134675m);
                qVar.copyOnWrite();
                C60218r rVar = (C60218r) qVar.instance;
                b2.getClass();
                rVar.f162928b = b2;
                rVar.f162927a |= 1;
                odVar.copyOnWrite();
                C60321oe oeVar = (C60321oe) odVar.instance;
                C60218r rVar2 = (C60218r) qVar.build();
                rVar2.getClass();
                oeVar.f163229d = rVar2;
                oeVar.f163226a |= 2;
            } catch (IOException unused) {
                C58976aa aaVar = C58975e.f156826a;
            }
        }
        aqp aqp = (aqp) ((aqs) b.f163228c.get(0)).toBuilder();
        aap aap = aas.f134676n;
        if (aap == null) {
            aap = aap.f134650h;
        }
        if ((aap.f134652a & 8) != 0) {
            aap aap2 = aas.f134676n;
            if (aap2 == null) {
                aap2 = aap.f134650h;
            }
            C63204j jVar = aap2.f134657f;
            if (jVar == null) {
                jVar = C63204j.f170749e;
            }
            aqp.copyOnWrite();
            aqs aqs = (aqs) aqp.instance;
            jVar.getClass();
            aqs.f159788g = jVar;
            aqs.f159782a |= 16;
        }
        odVar.mo57084d(0, (aqs) aqp.build());
        return (C60321oe) odVar.build();
    }

    /* renamed from: h */
    public static C60321oe m64612h(int i, aas aas) {
        return m64611g(i, C28293k.m52908e(new C28292j(i), new C28293k[0]), aas);
    }
}
