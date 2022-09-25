package com.google.android.libraries.cast.usonia.adapter.p1674a;

import com.google.android.gms.usonia.DeviceInfo;
import com.google.android.gms.usonia.PeerAddress;
import com.google.p427am.p438d.p439a.C8747bu;
import com.google.p427am.p438d.p439a.C8748bv;
import com.google.p427am.p438d.p439a.C8749bw;
import com.google.p427am.p438d.p439a.C8750bx;
import com.google.p427am.p438d.p439a.C8751by;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.NoSuchElementException;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.libraries.cast.usonia.adapter.a.b */
/* compiled from: PG */
public final class C19703b {
    /* renamed from: a */
    public static final PeerAddress m37518a(C8751by byVar) {
        int i;
        C69664n.m101061g(byVar, "<this>");
        C8750bx a = C8750bx.m23400a(byVar.f30104a);
        if (a == null) {
            a = C8750bx.UNRECOGNIZED;
        }
        switch (a.ordinal()) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                throw new IllegalArgumentException();
        }
        String str = byVar.f30105b;
        C69664n.m101060f(str, "this.ipAddressPort");
        InetAddress byName = InetAddress.getByName(C69764m.m101202v(str, ":", str));
        String str2 = byVar.f30105b;
        C69664n.m101060f(str2, "this.ipAddressPort");
        C69664n.m101061g(str2, "<this>");
        C69664n.m101061g(str2, "missingDelimiterValue");
        int H = C69764m.m101191H(str2, ":");
        if (H != -1) {
            str2 = str2.substring(H + 1, str2.length());
            C69664n.m101060f(str2, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        return new PeerAddress(byName.getAddress(), Integer.parseInt(str2), byVar.f30106c, i - 1);
    }

    /* renamed from: b */
    public static final C8748bv m37519b(DeviceInfo deviceInfo) {
        C69664n.m101061g(deviceInfo, "<this>");
        C8747bu buVar = (C8747bu) C8748bv.f30088c.createBuilder();
        C69664n.m101060f(buVar, "newBuilder()");
        C69664n.m101061g(buVar, "builder");
        C63088z A = C63088z.m96139A(deviceInfo.f394829a);
        buVar.copyOnWrite();
        ((C8748bv) buVar.instance).f30090a = A;
        String str = deviceInfo.f394830b;
        C69664n.m101060f(str, "this@toPackedPeerAddress.deviceId");
        C69664n.m101061g(str, "value");
        buVar.copyOnWrite();
        str.getClass();
        ((C8748bv) buVar.instance).f30091b = str;
        C62942bv build = buVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C8748bv) build;
    }

    /* renamed from: c */
    public static final C8751by m37520c(PeerAddress peerAddress) {
        C8750bx bxVar;
        C69664n.m101061g(peerAddress, "<this>");
        int[] iArr = {1, 2, 3, 4, 5, 6, 7};
        int i = 0;
        while (i < 7) {
            int i2 = iArr[i];
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            } else if (i3 == peerAddress.f394834d) {
                C8750bx bxVar2 = C8750bx.INVALID;
                switch (i3) {
                    case 0:
                        bxVar = C8750bx.INVALID;
                        break;
                    case 1:
                        bxVar = C8750bx.NORMAL;
                        break;
                    case 2:
                        bxVar = C8750bx.LOCAL;
                        break;
                    case 3:
                        bxVar = C8750bx.ANY;
                        break;
                    case 4:
                        bxVar = C8750bx.ANY_EXCEPT_LOCAL;
                        break;
                    case 5:
                        bxVar = C8750bx.ALL;
                        break;
                    case 6:
                        bxVar = C8750bx.ALL_EXCEPT_LOCAL;
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
                C8749bw bwVar = (C8749bw) C8751by.f30102d.createBuilder();
                C69664n.m101060f(bwVar, "newBuilder()");
                C69664n.m101061g(bwVar, "builder");
                C69664n.m101061g(bxVar, "value");
                bwVar.copyOnWrite();
                ((C8751by) bwVar.instance).f30104a = bxVar.getNumber();
                byte[] bArr = peerAddress.f394831a;
                bwVar.copyOnWrite();
                ((C8751by) bwVar.instance).f30105b = InetAddress.getByAddress(Arrays.copyOf(bArr, bArr.length)).getHostAddress() + ":" + peerAddress.f394832b;
                String str = peerAddress.f394833c;
                C69664n.m101060f(str, "this@toPeerAddressProto.deviceId");
                C69664n.m101061g(str, "value");
                bwVar.copyOnWrite();
                str.getClass();
                ((C8751by) bwVar.instance).f30106c = str;
                C62942bv build = bwVar.build();
                C69664n.m101060f(build, "_builder.build()");
                return (C8751by) build;
            } else {
                i++;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
