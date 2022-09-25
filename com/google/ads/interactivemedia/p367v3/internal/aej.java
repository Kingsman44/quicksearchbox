package com.google.ads.interactivemedia.p367v3.internal;

import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aej */
/* compiled from: PG */
public final class aej {

    /* renamed from: a */
    private static final Comparator f20437a = aeg.f20432a;

    /* renamed from: b */
    private static final Comparator f20438b = aeh.f20433a;

    /* renamed from: c */
    private final int f20439c = SimpleSnackbar.LENGTH_SHORT;

    /* renamed from: d */
    private final ArrayList f20440d = new ArrayList();

    /* renamed from: e */
    private final aei[] f20441e = new aei[5];

    /* renamed from: f */
    private int f20442f = -1;

    /* renamed from: g */
    private int f20443g;

    /* renamed from: h */
    private int f20444h;

    /* renamed from: i */
    private int f20445i;

    public aej(int i) {
    }

    /* renamed from: a */
    public final void mo14584a() {
        this.f20440d.clear();
        this.f20442f = -1;
        this.f20443g = 0;
        this.f20444h = 0;
    }

    /* renamed from: b */
    public final void mo14585b(int i, float f) {
        aei aei;
        if (this.f20442f != 1) {
            Collections.sort(this.f20440d, f20437a);
            this.f20442f = 1;
        }
        int i2 = this.f20445i;
        if (i2 > 0) {
            aei[] aeiArr = this.f20441e;
            int i3 = i2 - 1;
            this.f20445i = i3;
            aei = aeiArr[i3];
        } else {
            aei = new aei((byte[]) null);
        }
        int i4 = this.f20443g;
        this.f20443g = i4 + 1;
        aei.f20434a = i4;
        aei.f20435b = i;
        aei.f20436c = f;
        this.f20440d.add(aei);
        this.f20444h += i;
        while (true) {
            int i5 = this.f20444h;
            if (i5 > 2000) {
                int i6 = i5 - 2000;
                aei aei2 = (aei) this.f20440d.get(0);
                int i7 = aei2.f20435b;
                if (i7 <= i6) {
                    this.f20444h -= i7;
                    this.f20440d.remove(0);
                    int i8 = this.f20445i;
                    if (i8 < 5) {
                        aei[] aeiArr2 = this.f20441e;
                        this.f20445i = i8 + 1;
                        aeiArr2[i8] = aei2;
                    }
                } else {
                    aei2.f20435b = i7 - i6;
                    this.f20444h -= i6;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final float mo14586c() {
        if (this.f20442f != 0) {
            Collections.sort(this.f20440d, f20438b);
            this.f20442f = 0;
        }
        float f = ((float) this.f20444h) * 0.5f;
        int i = 0;
        for (int i2 = 0; i2 < this.f20440d.size(); i2++) {
            aei aei = (aei) this.f20440d.get(i2);
            i += aei.f20435b;
            if (((float) i) >= f) {
                return aei.f20436c;
            }
        }
        if (this.f20440d.isEmpty()) {
            return Float.NaN;
        }
        ArrayList arrayList = this.f20440d;
        return ((aei) arrayList.get(arrayList.size() - 1)).f20436c;
    }
}
