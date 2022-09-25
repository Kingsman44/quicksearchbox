package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.C4265d;
import java.nio.charset.Charset;

/* compiled from: PG */
public class IconCompatParcelizer {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.core.graphics.drawable.IconCompat read(androidx.versionedparcelable.C4265d r5) {
        /*
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>()
            int r1 = r0.f5826b
            r2 = 1
            int r1 = r5.mo9097b(r1, r2)
            r0.f5826b = r1
            byte[] r1 = r0.f5828d
            r2 = 2
            boolean r3 = r5.mo9093D(r2)
            if (r3 == 0) goto L_0x001b
            byte[] r1 = r5.mo9094E()
        L_0x001b:
            r0.f5828d = r1
            android.os.Parcelable r1 = r0.f5829e
            r3 = 3
            android.os.Parcelable r1 = r5.mo9102g(r1, r3)
            r0.f5829e = r1
            int r1 = r0.f5830f
            r4 = 4
            int r1 = r5.mo9097b(r1, r4)
            r0.f5830f = r1
            int r1 = r0.f5831g
            r4 = 5
            int r1 = r5.mo9097b(r1, r4)
            r0.f5831g = r1
            android.content.res.ColorStateList r1 = r0.f5832h
            r4 = 6
            android.os.Parcelable r1 = r5.mo9102g(r1, r4)
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            r0.f5832h = r1
            java.lang.String r1 = r0.f5834j
            r4 = 7
            java.lang.String r1 = r5.mo9109n(r1, r4)
            r0.f5834j = r1
            java.lang.String r1 = r0.f5835k
            r4 = 8
            java.lang.String r5 = r5.mo9109n(r1, r4)
            r0.f5835k = r5
            java.lang.String r5 = r0.f5834j
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.valueOf(r5)
            r0.f5833i = r5
            int r5 = r0.f5826b
            r1 = 0
            switch(r5) {
                case -1: goto L_0x00a2;
                case 0: goto L_0x0064;
                case 1: goto L_0x0091;
                case 2: goto L_0x006a;
                case 3: goto L_0x0065;
                case 4: goto L_0x006a;
                case 5: goto L_0x0091;
                case 6: goto L_0x006a;
                default: goto L_0x0064;
            }
        L_0x0064:
            goto L_0x00b1
        L_0x0065:
            byte[] r5 = r0.f5828d
            r0.f5827c = r5
            goto L_0x00b1
        L_0x006a:
            java.lang.String r5 = new java.lang.String
            byte[] r3 = r0.f5828d
            java.lang.String r4 = "UTF-16"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            r5.<init>(r3, r4)
            r0.f5827c = r5
            int r5 = r0.f5826b
            if (r5 != r2) goto L_0x00b1
            java.lang.String r5 = r0.f5835k
            if (r5 != 0) goto L_0x00b1
            java.lang.Object r5 = r0.f5827c
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r2 = ":"
            r3 = -1
            java.lang.String[] r5 = r5.split(r2, r3)
            r5 = r5[r1]
            r0.f5835k = r5
            goto L_0x00b1
        L_0x0091:
            android.os.Parcelable r5 = r0.f5829e
            if (r5 == 0) goto L_0x0096
            goto L_0x00a6
        L_0x0096:
            byte[] r5 = r0.f5828d
            r0.f5827c = r5
            r0.f5826b = r3
            r0.f5830f = r1
            int r5 = r5.length
            r0.f5831g = r5
            goto L_0x00b1
        L_0x00a2:
            android.os.Parcelable r5 = r0.f5829e
            if (r5 == 0) goto L_0x00a9
        L_0x00a6:
            r0.f5827c = r5
            goto L_0x00b1
        L_0x00a9:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid icon"
            r5.<init>(r0)
            throw r5
        L_0x00b1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompatParcelizer.read(androidx.versionedparcelable.d):androidx.core.graphics.drawable.IconCompat");
    }

    public static void write(IconCompat iconCompat, C4265d dVar) {
        iconCompat.f5834j = iconCompat.f5833i.name();
        switch (iconCompat.f5826b) {
            case -1:
                iconCompat.f5829e = (Parcelable) iconCompat.f5827c;
                break;
            case 1:
            case 5:
                iconCompat.f5829e = (Parcelable) iconCompat.f5827c;
                break;
            case 2:
                iconCompat.f5828d = ((String) iconCompat.f5827c).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f5828d = (byte[]) iconCompat.f5827c;
                break;
            case 4:
            case 6:
                iconCompat.f5828d = iconCompat.f5827c.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f5826b;
        if (i != -1) {
            dVar.mo9111p(1);
            dVar.mo9117v(i);
        }
        byte[] bArr = iconCompat.f5828d;
        if (bArr != null) {
            dVar.mo9111p(2);
            dVar.mo9115t(bArr);
        }
        Parcelable parcelable = iconCompat.f5829e;
        if (parcelable != null) {
            dVar.mo9111p(3);
            dVar.mo9119x(parcelable);
        }
        int i2 = iconCompat.f5830f;
        if (i2 != 0) {
            dVar.mo9111p(4);
            dVar.mo9117v(i2);
        }
        int i3 = iconCompat.f5831g;
        if (i3 != 0) {
            dVar.mo9111p(5);
            dVar.mo9117v(i3);
        }
        ColorStateList colorStateList = iconCompat.f5832h;
        if (colorStateList != null) {
            dVar.mo9111p(6);
            dVar.mo9119x(colorStateList);
        }
        String str = iconCompat.f5834j;
        if (str != null) {
            dVar.mo9111p(7);
            dVar.mo9120y(str);
        }
        String str2 = iconCompat.f5835k;
        if (str2 != null) {
            dVar.mo9111p(8);
            dVar.mo9120y(str2);
        }
    }
}
