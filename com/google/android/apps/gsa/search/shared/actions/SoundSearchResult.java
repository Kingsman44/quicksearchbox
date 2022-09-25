package com.google.android.apps.gsa.search.shared.actions;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.C58832aw;
import com.google.p4152bb.p4153a.C55421x;
import java.util.Arrays;

/* compiled from: PG */
public class SoundSearchResult extends VisitableAbstractVoiceAction {
    public static final Parcelable.Creator CREATOR = new C87476s();

    /* renamed from: f */
    public String f236030f;

    /* renamed from: g */
    public String f236031g;

    /* renamed from: h */
    public String f236032h;

    /* renamed from: i */
    public String f236033i;

    /* renamed from: j */
    public String f236034j;

    /* renamed from: k */
    public Bitmap f236035k;

    /* renamed from: l */
    public String f236036l;

    /* renamed from: m */
    public int f236037m;

    /* renamed from: n */
    private boolean f236038n;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        if (r0.equals("SOUND_SEARCH") != false) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SoundSearchResult(android.os.Parcel r6) {
        /*
            r5 = this;
            r5.<init>(r6)
            java.lang.String r0 = r6.readString()
            r5.f236032h = r0
            java.lang.String r0 = r6.readString()
            r5.f236031g = r0
            java.lang.String r0 = r6.readString()
            r5.f236030f = r0
            int r0 = r6.readInt()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x001f
            r0 = 1
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r5.f236038n = r0
            java.lang.String r0 = r6.readString()
            r5.f236033i = r0
            java.lang.String r0 = r6.readString()
            r5.f236034j = r0
            java.lang.String r0 = r6.readString()
            int r3 = r0.hashCode()
            r4 = -2060096776(0xffffffff85356af8, float:-8.530226E-36)
            if (r3 == r4) goto L_0x004b
            r1 = -1960088841(0xffffffff8b2b6af7, float:-3.3013873E-32)
            if (r3 == r1) goto L_0x0041
            goto L_0x0054
        L_0x0041:
            java.lang.String r1 = "MEDIA_CONTROLLER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r1 = 1
            goto L_0x0055
        L_0x004b:
            java.lang.String r3 = "SOUND_SEARCH"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r1 = -1
        L_0x0055:
            if (r1 == 0) goto L_0x0061
            if (r1 != r2) goto L_0x005b
            r2 = 2
            goto L_0x0061
        L_0x005b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        L_0x0061:
            r5.f236037m = r2
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r6.readParcelable(r0)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r5.f236035k = r0
            java.lang.String r6 = r6.readString()
            r5.f236036l = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.SoundSearchResult.<init>(android.os.Parcel):void");
    }

    /* renamed from: L */
    public final Object mo81132L(C87501w wVar) {
        return wVar.mo81497d(this);
    }

    /* renamed from: M */
    public final boolean mo81133M() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SoundSearchResult) {
            SoundSearchResult soundSearchResult = (SoundSearchResult) obj;
            if (this.f236038n != soundSearchResult.f236038n || !C58832aw.m90831a(this.f236030f, soundSearchResult.f236030f) || !C58832aw.m90831a(this.f236031g, soundSearchResult.f236031g) || !C58832aw.m90831a(this.f236032h, soundSearchResult.f236032h) || !C58832aw.m90831a(this.f236033i, soundSearchResult.f236033i) || !C58832aw.m90831a(this.f236034j, soundSearchResult.f236034j) || this.f236037m != soundSearchResult.f236037m || !C58832aw.m90831a(this.f236035k, soundSearchResult.f236035k) || !C58832aw.m90831a(this.f236036l, soundSearchResult.f236036l)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final C55421x mo81066g() {
        return C55421x.PLAY_MUSIC;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f236030f, this.f236031g, this.f236032h, Boolean.valueOf(this.f236038n), this.f236033i, this.f236034j, Integer.valueOf(this.f236037m), this.f236035k, this.f236036l});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f236032h);
        parcel.writeString(this.f236031g);
        parcel.writeString(this.f236030f);
        parcel.writeInt(this.f236038n ? 1 : 0);
        parcel.writeString(this.f236033i);
        parcel.writeString(this.f236034j);
        int i2 = this.f236037m;
        String str = i2 != 1 ? i2 != 2 ? "null" : "MEDIA_CONTROLLER" : "SOUND_SEARCH";
        if (i2 != 0) {
            parcel.writeString(str);
            parcel.writeParcelable(this.f236035k, i);
            parcel.writeString(this.f236036l);
            return;
        }
        throw null;
    }

    public SoundSearchResult(String str, String str2, String str3, Bitmap bitmap, String str4) {
        this.f236032h = str;
        this.f236031g = str2;
        str3.getClass();
        this.f236030f = str3;
        this.f236038n = false;
        this.f236033i = null;
        this.f236034j = null;
        this.f236037m = 2;
        this.f236035k = bitmap;
        this.f236036l = str4;
    }
}
