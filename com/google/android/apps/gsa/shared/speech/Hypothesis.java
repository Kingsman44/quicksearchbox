package com.google.android.apps.gsa.shared.speech;

import android.os.Parcel;
import android.os.Parcelable;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.speech.p5195a.C66447b;
import com.google.speech.p5195a.C66451f;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
public class Hypothesis implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C90577h();

    /* renamed from: a */
    public final String f253055a;

    /* renamed from: b */
    public final float f253056b;

    /* renamed from: c */
    public C58485gu f253057c;

    /* compiled from: PG */
    public class Span implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C90601i();

        /* renamed from: a */
        public final int f253058a;

        /* renamed from: b */
        public final int f253059b;

        /* renamed from: c */
        public final int f253060c;

        /* renamed from: d */
        public final int f253061d;

        /* renamed from: e */
        public C58485gu f253062e;

        public Span(int i, int i2, int i3, int i4, C58485gu guVar) {
            this.f253058a = i;
            this.f253059b = i2;
            this.f253060c = i3;
            this.f253061d = i4;
            this.f253062e = guVar;
        }

        public Span(Parcel parcel) {
            this.f253058a = parcel.readInt();
            this.f253059b = parcel.readInt();
            this.f253060c = parcel.readInt();
            this.f253061d = parcel.readInt();
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f253062e = C58485gu.m89842j(arrayList);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Span) {
                Span span = (Span) obj;
                if (this.f253058a == span.f253058a && this.f253059b == span.f253059b && this.f253060c == span.f253060c && this.f253061d == span.f253061d && C58832aw.m90831a(this.f253062e, span.f253062e)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f253058a), Integer.valueOf(this.f253059b), Integer.valueOf(this.f253060c), Integer.valueOf(this.f253061d), this.f253062e});
        }

        public final String toString() {
            C58830au b = C58831av.m90829b(this);
            b.mo56103c("mUtf16Start", String.valueOf(this.f253058a));
            b.mo56103c("mUtf16End", String.valueOf(this.f253059b));
            b.mo56103c("mUtf8Start", String.valueOf(this.f253060c));
            b.mo56103c("mUtf8Length", String.valueOf(this.f253061d));
            b.mo56102b("mAlternates", this.f253062e);
            return b.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f253058a);
            parcel.writeInt(this.f253059b);
            parcel.writeInt(this.f253060c);
            parcel.writeInt(this.f253061d);
            parcel.writeStringList(this.f253062e);
        }
    }

    public Hypothesis(Parcel parcel) {
        String readString = parcel.readString();
        this.f253055a = readString == null ? BuildConfig.FLAVOR : readString;
        this.f253056b = parcel.readFloat();
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, Span.CREATOR);
        this.f253057c = C58485gu.m89842j(arrayList);
    }

    /* renamed from: a */
    private static int m147644a(byte[] bArr, int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && i2 < bArr.length) {
            byte b = bArr[i2] & 255;
            if ((b >>> 7) == 0) {
                i3++;
                i2++;
            } else {
                if ((b >>> 5) == 6) {
                    if (i2 + 1 >= i) {
                        return i3;
                    }
                    i2 += 2;
                } else if ((b >>> 4) == 14) {
                    if (i2 + 2 >= i) {
                        return i3;
                    }
                    i2 += 3;
                } else if ((b >>> 3) != 30) {
                    continue;
                } else if (i2 + 3 >= i) {
                    return i3;
                } else {
                    i2 += 4;
                    i3 += 2;
                }
                i3++;
            }
        }
        return i3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Hypothesis) {
            Hypothesis hypothesis = (Hypothesis) obj;
            if (!C58832aw.m90831a(this.f253055a, hypothesis.f253055a) || Math.abs(this.f253056b - hypothesis.f253056b) >= 0.001f || !C58832aw.m90831a(this.f253057c, hypothesis.f253057c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f253055a, this.f253057c});
    }

    public final String toString() {
        String str = this.f253055a;
        float f = this.f253056b;
        int size = this.f253057c.size();
        return "Hypothesis: [" + str + ", " + f + "] with " + size + " span(s)";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f253055a);
        parcel.writeFloat(this.f253056b);
        parcel.writeTypedList(this.f253057c);
    }

    public Hypothesis(CharSequence charSequence, float f) {
        this.f253055a = charSequence.toString();
        this.f253056b = f;
        this.f253057c = C58485gu.m89845m();
    }

    public Hypothesis(CharSequence charSequence, float f, List list) {
        this(charSequence, f);
        C58480gp e = C58485gu.m89837e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C66451f fVar = (C66451f) it.next();
            try {
                byte[] bytes = this.f253055a.getBytes("UTF-8");
                int a = m147644a(bytes, fVar.f180687a);
                int a2 = m147644a(bytes, fVar.f180687a + fVar.f180688b);
                C58480gp e2 = C58485gu.m89837e();
                for (C66447b bVar : fVar.f180689c) {
                    e2.mo55395g(bVar.f180677a);
                }
                e.mo55395g(new Span(a, a2, fVar.f180687a, fVar.f180688b, e2.mo55394f()));
            } catch (UnsupportedEncodingException e3) {
                throw new RuntimeException(e3);
            }
        }
        this.f253057c = e.mo55394f();
    }
}
