package com.google.android.apps.gsa.shared.notificationlistening.common;

import android.app.Notification;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.app.C1832s;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
public class MessageNotification extends C90421b implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C90428i();

    /* renamed from: K */
    private static final C59071e f252530K = C59071e.m91332i("com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification");

    /* renamed from: A */
    public C1832s f252531A;

    /* renamed from: B */
    public boolean f252532B;

    /* renamed from: C */
    public final Bitmap f252533C;

    /* renamed from: D */
    public final Notification f252534D;

    /* renamed from: E */
    public final CharSequence f252535E;

    /* renamed from: F */
    public final C90427h f252536F;

    /* renamed from: G */
    public final boolean f252537G;

    /* renamed from: H */
    public final String f252538H;

    /* renamed from: I */
    public final String f252539I;

    /* renamed from: J */
    public final byte[] f252540J;

    /* renamed from: r */
    public final CharSequence f252541r;

    /* renamed from: s */
    public final Iterable f252542s;

    /* renamed from: t */
    public final CharSequence f252543t;

    /* renamed from: u */
    public final CharSequence f252544u;

    /* renamed from: v */
    public final String f252545v;

    /* renamed from: w */
    public final Uri f252546w;

    /* renamed from: x */
    public final String f252547x;

    /* renamed from: y */
    public C1832s f252548y;

    /* renamed from: z */
    public boolean f252549z;

    public MessageNotification(C90429j jVar) {
        super(jVar);
        String str;
        CharSequence charSequence = jVar.f252620q;
        this.f252541r = charSequence;
        CharSequence charSequence2 = jVar.f252622s;
        this.f252543t = charSequence2;
        this.f252545v = jVar.f252623t;
        this.f252546w = jVar.f252624u;
        this.f252547x = jVar.f252625v;
        this.f252544u = jVar.f252626w;
        this.f252548y = jVar.f252627x;
        this.f252531A = jVar.f252629z;
        this.f252534D = jVar.f252614C;
        this.f252542s = jVar.f252621r;
        this.f252533C = jVar.f252613B;
        this.f252540J = jVar.f252619H;
        this.f252539I = jVar.f252618G;
        CharSequence charSequence3 = jVar.f252615D;
        if (charSequence3 == null) {
            ((C59052c) ((C59052c) f252530K.mo56226d()).mo56372aa(10941)).mo56386p("Sender name is required.");
            int i = C90755l.f253831a;
            charSequence3 = BuildConfig.FLAVOR;
        }
        this.f252535E = charSequence3;
        String str2 = this.f252591l;
        String str3 = this.f252581b;
        boolean z = charSequence != null;
        CharSequence charSequence4 = jVar.f252620q;
        Iterable iterable = jVar.f252621r;
        if (charSequence4 == null) {
            str = charSequence3.toString();
        } else if (iterable == null || !iterable.iterator().hasNext()) {
            str = charSequence4.toString();
        } else {
            ArrayList b = C58597ky.m90211b(iterable);
            Collections.sort(b);
            str = charSequence4.toString() + b.hashCode();
        }
        this.f252536F = new C90427h(str2, str3, z, str);
        if (charSequence2 == null && jVar.f252567d == null) {
            ((C59052c) ((C59052c) f252530K.mo56226d()).mo56372aa(10940)).mo56386p("One of message or audio contents is required.");
            int i2 = C90755l.f253831a;
        }
        this.f252549z = jVar.f252628y;
        this.f252532B = jVar.f252612A;
        this.f252537G = jVar.f252616E;
        this.f252538H = jVar.f252617F;
    }

    /* renamed from: b */
    public final C90427h mo84131b() {
        return this.f252536F;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo84133e(C90421b bVar) {
        if (super.mo84133e(bVar) && (bVar instanceof MessageNotification)) {
            MessageNotification messageNotification = (MessageNotification) bVar;
            CharSequence charSequence = this.f252544u;
            if (charSequence == null) {
                charSequence = this.f252543t;
            }
            CharSequence charSequence2 = messageNotification.f252544u;
            if (charSequence2 == null) {
                charSequence2 = messageNotification.f252543t;
            }
            if (mo84135h() != messageNotification.mo84135h() || mo84134g() != messageNotification.mo84134g() || !TextUtils.equals(this.f252535E, messageNotification.f252535E) || !TextUtils.equals(this.f252541r, messageNotification.f252541r) || !TextUtils.equals(charSequence, charSequence2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo84134g() {
        return this.f252541r != null;
    }

    /* renamed from: h */
    public final boolean mo84135h() {
        return this.f252582c != null;
    }

    public final String toString() {
        boolean z = true;
        String str = "MessageNotification: identifier=".concat(this.f252536F.toString()) + ", has groupName=" + (this.f252541r != null) + ", has text message=" + (this.f252543t != null) + ", has original message=" + (this.f252544u != null);
        if (this.f252548y == null) {
            z = false;
        }
        return str + ", has replyAction=" + z + ", " + super.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        CharSequence charSequence = this.f252541r;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        Iterable iterable = this.f252542s;
        parcel.writeStringList(iterable != null ? C58597ky.m90211b(iterable) : new ArrayList());
        TextUtils.writeToParcel(this.f252543t, parcel, i);
        TextUtils.writeToParcel(this.f252544u, parcel, i);
        TextUtils.writeToParcel(this.f252535E, parcel, i);
        parcel.writeString(this.f252545v);
        parcel.writeParcelable(this.f252546w, i);
        parcel.writeString(this.f252547x);
        parcel.writeParcelable(this.f252533C, i);
        parcel.writeParcelable(this.f252534D, i);
        parcel.writeByte(this.f252549z ? (byte) 1 : 0);
        parcel.writeByte(this.f252532B ? (byte) 1 : 0);
        parcel.writeByte(this.f252537G ? (byte) 1 : 0);
        parcel.writeString(this.f252538H);
        parcel.writeString(this.f252539I);
        byte[] bArr = this.f252540J;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(this.f252540J);
            return;
        }
        parcel.writeInt(0);
    }
}
