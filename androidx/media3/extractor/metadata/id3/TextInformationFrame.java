package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.p136b.C2612ak;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = new C3609m();

    /* renamed from: a */
    public final String f11492a;

    /* renamed from: b */
    public final String f11493b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInformationFrame(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = androidx.media3.common.p136b.C2612ak.f7249a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f11492a = r0
            java.lang.String r3 = r3.readString()
            r2.f11493b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.metadata.id3.TextInformationFrame.<init>(android.os.Parcel):void");
    }

    /* renamed from: d */
    private static List m10410d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6067b(androidx.media3.common.C2592as r8) {
        /*
            r7 = this;
            java.lang.String r0 = r7.f11481f
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = 0
            r5 = 1
            r6 = 2
            switch(r1) {
                case 82815: goto L_0x00fc;
                case 82878: goto L_0x00f1;
                case 82897: goto L_0x00e6;
                case 83253: goto L_0x00dc;
                case 83254: goto L_0x00d2;
                case 83255: goto L_0x00c7;
                case 83341: goto L_0x00bc;
                case 83378: goto L_0x00b2;
                case 83536: goto L_0x00a7;
                case 83552: goto L_0x009c;
                case 2567331: goto L_0x0091;
                case 2569357: goto L_0x0085;
                case 2569891: goto L_0x0079;
                case 2570401: goto L_0x006d;
                case 2570410: goto L_0x0061;
                case 2571565: goto L_0x0055;
                case 2575251: goto L_0x004a;
                case 2581512: goto L_0x003f;
                case 2581513: goto L_0x0034;
                case 2581514: goto L_0x0028;
                case 2583398: goto L_0x001c;
                case 2590194: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0106
        L_0x0010:
            java.lang.String r1 = "TYER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 11
            goto L_0x0107
        L_0x001c:
            java.lang.String r1 = "TRCK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 9
            goto L_0x0107
        L_0x0028:
            java.lang.String r1 = "TPE3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 19
            goto L_0x0107
        L_0x0034:
            java.lang.String r1 = "TPE2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 5
            goto L_0x0107
        L_0x003f:
            java.lang.String r1 = "TPE1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 3
            goto L_0x0107
        L_0x004a:
            java.lang.String r1 = "TIT2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 1
            goto L_0x0107
        L_0x0055:
            java.lang.String r1 = "TEXT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 21
            goto L_0x0107
        L_0x0061:
            java.lang.String r1 = "TDRL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 15
            goto L_0x0107
        L_0x006d:
            java.lang.String r1 = "TDRC"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 14
            goto L_0x0107
        L_0x0079:
            java.lang.String r1 = "TDAT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 13
            goto L_0x0107
        L_0x0085:
            java.lang.String r1 = "TCOM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 17
            goto L_0x0107
        L_0x0091:
            java.lang.String r1 = "TALB"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 7
            goto L_0x0107
        L_0x009c:
            java.lang.String r1 = "TYE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 10
            goto L_0x0107
        L_0x00a7:
            java.lang.String r1 = "TXT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 20
            goto L_0x0107
        L_0x00b2:
            java.lang.String r1 = "TT2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 0
            goto L_0x0107
        L_0x00bc:
            java.lang.String r1 = "TRK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 8
            goto L_0x0107
        L_0x00c7:
            java.lang.String r1 = "TP3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 18
            goto L_0x0107
        L_0x00d2:
            java.lang.String r1 = "TP2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 4
            goto L_0x0107
        L_0x00dc:
            java.lang.String r1 = "TP1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 2
            goto L_0x0107
        L_0x00e6:
            java.lang.String r1 = "TDA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 12
            goto L_0x0107
        L_0x00f1:
            java.lang.String r1 = "TCM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 16
            goto L_0x0107
        L_0x00fc:
            java.lang.String r1 = "TAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0106
            r0 = 6
            goto L_0x0107
        L_0x0106:
            r0 = -1
        L_0x0107:
            switch(r0) {
                case 0: goto L_0x01d4;
                case 1: goto L_0x01d4;
                case 2: goto L_0x01cf;
                case 3: goto L_0x01cf;
                case 4: goto L_0x01ca;
                case 5: goto L_0x01ca;
                case 6: goto L_0x01c5;
                case 7: goto L_0x01c5;
                case 8: goto L_0x019f;
                case 9: goto L_0x019f;
                case 10: goto L_0x0192;
                case 11: goto L_0x0192;
                case 12: goto L_0x0171;
                case 13: goto L_0x0171;
                case 14: goto L_0x0146;
                case 15: goto L_0x011b;
                case 16: goto L_0x0116;
                case 17: goto L_0x0116;
                case 18: goto L_0x0111;
                case 19: goto L_0x0111;
                case 20: goto L_0x010c;
                case 21: goto L_0x010c;
                default: goto L_0x010a;
            }
        L_0x010a:
            goto L_0x01d8
        L_0x010c:
            java.lang.String r0 = r7.f11493b
            r8.f7177p = r0
            return
        L_0x0111:
            java.lang.String r0 = r7.f11493b
            r8.f7179r = r0
            return
        L_0x0116:
            java.lang.String r0 = r7.f11493b
            r8.f7178q = r0
            return
        L_0x011b:
            java.lang.String r0 = r7.f11493b
            java.util.List r0 = m10410d(r0)
            int r1 = r0.size()
            if (r1 == r5) goto L_0x013d
            if (r1 == r6) goto L_0x0135
            if (r1 == r3) goto L_0x012d
            goto L_0x01d8
        L_0x012d:
            java.lang.Object r1 = r0.get(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8.f7176o = r1
        L_0x0135:
            java.lang.Object r1 = r0.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8.f7175n = r1
        L_0x013d:
            java.lang.Object r0 = r0.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.f7174m = r0
            return
        L_0x0146:
            java.lang.String r0 = r7.f11493b
            java.util.List r0 = m10410d(r0)
            int r1 = r0.size()
            if (r1 == r5) goto L_0x0168
            if (r1 == r6) goto L_0x0160
            if (r1 == r3) goto L_0x0158
            goto L_0x01d8
        L_0x0158:
            java.lang.Object r1 = r0.get(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8.f7173l = r1
        L_0x0160:
            java.lang.Object r1 = r0.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8.f7172k = r1
        L_0x0168:
            java.lang.Object r0 = r0.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.f7171j = r0
            return
        L_0x0171:
            java.lang.String r0 = r7.f11493b     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0191 }
            java.lang.String r0 = r0.substring(r6, r2)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0191 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0191 }
            java.lang.String r1 = r7.f11493b     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0191 }
            java.lang.String r1 = r1.substring(r4, r6)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0191 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0191 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0191 }
            r8.f7172k = r0     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0191 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0191 }
            r8.f7173l = r0     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0191 }
        L_0x0191:
            return
        L_0x0192:
            java.lang.String r0 = r7.f11493b     // Catch:{ NumberFormatException -> 0x019e }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x019e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x019e }
            r8.f7171j = r0     // Catch:{ NumberFormatException -> 0x019e }
        L_0x019e:
            return
        L_0x019f:
            java.lang.String r0 = r7.f11493b
            java.lang.String r1 = "/"
            java.lang.String[] r0 = androidx.media3.common.p136b.C2612ak.m6967aq(r0, r1)
            r1 = r0[r4]     // Catch:{ NumberFormatException -> 0x01c4 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x01c4 }
            int r2 = r0.length     // Catch:{ NumberFormatException -> 0x01c4 }
            if (r2 <= r5) goto L_0x01bb
            r0 = r0[r5]     // Catch:{ NumberFormatException -> 0x01c4 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x01c4 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01c4 }
            goto L_0x01bc
        L_0x01bb:
            r0 = 0
        L_0x01bc:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x01c4 }
            r8.f7169h = r1     // Catch:{ NumberFormatException -> 0x01c4 }
            r8.f7170i = r0     // Catch:{ NumberFormatException -> 0x01c4 }
        L_0x01c4:
            return
        L_0x01c5:
            java.lang.String r0 = r7.f11493b
            r8.f7164c = r0
            return
        L_0x01ca:
            java.lang.String r0 = r7.f11493b
            r8.f7165d = r0
            return
        L_0x01cf:
            java.lang.String r0 = r7.f11493b
            r8.f7163b = r0
            return
        L_0x01d4:
            java.lang.String r0 = r7.f11493b
            r8.f7162a = r0
        L_0x01d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.metadata.id3.TextInformationFrame.mo6067b(androidx.media3.common.as):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
            return C2612ak.m6951aa(this.f11481f, textInformationFrame.f11481f) && C2612ak.m6951aa(this.f11492a, textInformationFrame.f11492a) && C2612ak.m6951aa(this.f11493b, textInformationFrame.f11493b);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f11481f.hashCode() + 527) * 31;
        String str = this.f11492a;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11493b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f11481f;
        String str2 = this.f11492a;
        String str3 = this.f11493b;
        return str + ": description=" + str2 + ": value=" + str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11481f);
        parcel.writeString(this.f11492a);
        parcel.writeString(this.f11493b);
    }

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.f11492a = str2;
        this.f11493b = str3;
    }
}
