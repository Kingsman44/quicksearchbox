package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.p4522b.C58471gg;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4535g.C59127at;
import java.util.ArrayList;

/* compiled from: PG */
public final class Entity1PData {

    /* renamed from: a */
    public final String f167237a;

    /* renamed from: b */
    public final String f167238b;

    /* renamed from: c */
    public final C58471gg f167239c;

    /* renamed from: d */
    public final C59127at f167240d;

    /* renamed from: e */
    public final C58471gg f167241e;

    /* renamed from: f */
    public final String f167242f;

    /* renamed from: g */
    public final String f167243g;

    /* renamed from: h */
    public final String f167244h;

    /* renamed from: i */
    public final String f167245i;

    /* renamed from: j */
    public final String f167246j;

    /* renamed from: k */
    public final String f167247k;

    /* renamed from: l */
    public final String f167248l;

    /* renamed from: m */
    public final String f167249m;

    /* renamed from: n */
    public final String f167250n;

    /* renamed from: o */
    public final String f167251o;

    /* renamed from: p */
    public final String f167252p;

    /* renamed from: q */
    public final String f167253q;

    /* renamed from: r */
    public final Float f167254r;

    /* renamed from: s */
    public final C58471gg f167255s;

    /* compiled from: PG */
    public final class BroaderUserInterest implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C61888ay();

        /* renamed from: a */
        private final String f167256a;

        /* renamed from: b */
        private final String f167257b;

        /* renamed from: c */
        private final float f167258c;

        /* renamed from: d */
        private final float f167259d;

        public BroaderUserInterest(Parcel parcel) {
            Bundle bundle = new Bundle();
            bundle.readFromParcel(parcel);
            this.f167256a = bundle.getString("textclassifier.extras.BroaderUserInterest.MID");
            this.f167257b = bundle.getString("textclassifier.extras.BroaderUserInterest.NAME");
            this.f167258c = bundle.getFloat("textclassifier.extras.BroaderUserInterest.IMPORTANCE");
            this.f167259d = bundle.getFloat("textclassifier.extras.BroaderUserInterest.CONFIDENCE");
        }

        public BroaderUserInterest(String str, String str2, float f, float f2) {
            this.f167256a = str;
            this.f167257b = str2;
            this.f167258c = f;
            this.f167259d = f2;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            Bundle bundle = new Bundle();
            bundle.putString("textclassifier.extras.BroaderUserInterest.MID", this.f167256a);
            bundle.putString("textclassifier.extras.BroaderUserInterest.NAME", this.f167257b);
            bundle.putFloat("textclassifier.extras.BroaderUserInterest.IMPORTANCE", this.f167258c);
            bundle.putFloat("textclassifier.extras.BroaderUserInterest.CONFIDENCE", this.f167259d);
            bundle.writeToParcel(parcel, i);
        }
    }

    /* compiled from: PG */
    public final class KgDeeplink implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C61891ba();

        /* renamed from: a */
        public static final C58495hd f167260a;

        /* renamed from: b */
        private final String f167261b;

        /* renamed from: c */
        private final Uri f167262c;

        /* renamed from: d */
        private final C58471gg f167263d;

        /* renamed from: e */
        private final String f167264e;

        static {
            C58490gz gzVar = new C58490gz(4);
            for (C61892bb bbVar : C61892bb.values()) {
                gzVar.mo55429h(Integer.valueOf(bbVar.f167362o), bbVar);
            }
            f167260a = gzVar.mo55427f(true);
        }

        public KgDeeplink(Parcel parcel) {
            Bundle bundle = new Bundle();
            bundle.readFromParcel(parcel);
            this.f167261b = bundle.getString("textclassifier.extras.KgDeeplink.PACKAGE_ID");
            this.f167262c = (Uri) bundle.getParcelable("textclassifier.extras.KgDeeplink.URI");
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("textclassifier.extras.KgDeeplink.ACTIONS");
            C58480gp e = C58485gu.m89837e();
            int size = integerArrayList.size();
            int i = 0;
            while (i < size) {
                Integer num = integerArrayList.get(i);
                C58495hd hdVar = f167260a;
                if (hdVar.containsKey(num)) {
                    e.mo55395g((C61892bb) hdVar.get(num));
                    i++;
                } else {
                    new StringBuilder("Unknown action value: ").append(num);
                    throw new IllegalArgumentException("Unknown action value: ".concat(String.valueOf(num)));
                }
            }
            this.f167263d = e.mo55394f();
            this.f167264e = bundle.getString("textclassifier.extras.KgDeeplink.DISPLAY_LABEL");
        }

        public KgDeeplink(String str, Uri uri, C58471gg ggVar, String str2) {
            this.f167261b = str;
            this.f167262c = uri;
            this.f167263d = ggVar;
            this.f167264e = str2;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            Bundle bundle = new Bundle();
            bundle.putString("textclassifier.extras.KgDeeplink.PACKAGE_ID", this.f167261b);
            bundle.putParcelable("textclassifier.extras.KgDeeplink.URI", this.f167262c);
            ArrayList arrayList = new ArrayList();
            C58801sm G = ((C58485gu) this.f167263d).listIterator(0);
            while (G.hasNext()) {
                arrayList.add(Integer.valueOf(((C61892bb) G.next()).f167362o));
            }
            bundle.putIntegerArrayList("textclassifier.extras.KgDeeplink.ACTIONS", arrayList);
            bundle.putString("textclassifier.extras.KgDeeplink.DISPLAY_LABEL", this.f167264e);
            bundle.writeToParcel(parcel, i);
        }
    }

    public Entity1PData(String str, String str2, C58471gg ggVar, C59127at atVar, C58471gg ggVar2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Float f, C58471gg ggVar3) {
        this.f167237a = str;
        this.f167238b = str2;
        this.f167239c = ggVar;
        this.f167240d = atVar;
        this.f167241e = ggVar2;
        this.f167242f = str3;
        this.f167243g = str4;
        this.f167244h = str5;
        this.f167245i = str6;
        this.f167246j = str7;
        this.f167247k = str8;
        this.f167248l = str9;
        this.f167249m = str10;
        this.f167250n = str11;
        this.f167251o = str12;
        this.f167252p = str13;
        this.f167253q = str14;
        this.f167254r = f;
        this.f167255s = ggVar3;
    }
}
