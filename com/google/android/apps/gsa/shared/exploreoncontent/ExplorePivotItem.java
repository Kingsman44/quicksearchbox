package com.google.android.apps.gsa.shared.exploreoncontent;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59071e;
import com.google.p395al.p398b.p399a.p402b.p403a.p406c.C8435b;
import com.google.p395al.p398b.p399a.p402b.p403a.p406c.C8437d;
import com.google.p395al.p398b.p399a.p402b.p403a.p406c.C8439f;
import com.google.p395al.p398b.p399a.p402b.p403a.p407d.C8441b;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54079ac;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54084ah;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54102az;
import com.google.protos.p4816ai.p4818b.C63204j;

/* compiled from: PG */
public class ExplorePivotItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C89722a();

    /* renamed from: a */
    public static final C59071e f242884a = C59071e.m91332i("com.google.android.apps.gsa.shared.exploreoncontent.ExplorePivotItem");

    /* renamed from: b */
    public final String f242885b;

    /* renamed from: c */
    public final String f242886c;

    /* renamed from: d */
    public final String f242887d;

    /* renamed from: e */
    public final String f242888e;

    /* renamed from: f */
    private final String f242889f;

    /* renamed from: g */
    private final String f242890g;

    /* renamed from: h */
    private final int f242891h;

    /* renamed from: i */
    private final int f242892i;

    /* renamed from: j */
    private final boolean f242893j;

    /* renamed from: k */
    private final boolean f242894k;

    /* renamed from: l */
    private final boolean f242895l;

    /* renamed from: m */
    private final String f242896m;

    /* renamed from: n */
    private final C63204j f242897n;

    protected ExplorePivotItem(Parcel parcel) {
        this.f242885b = parcel.readString();
        this.f242889f = parcel.readString();
        this.f242890g = parcel.readString();
        this.f242886c = parcel.readString();
        this.f242891h = parcel.readInt();
        this.f242892i = parcel.readInt();
        this.f242887d = parcel.readString();
        this.f242888e = parcel.readString();
        boolean z = false;
        this.f242893j = parcel.readInt() == 1;
        this.f242894k = parcel.readInt() == 1;
        this.f242895l = parcel.readInt() == 1 ? true : z;
        this.f242896m = parcel.readString();
        this.f242897n = (C63204j) ProtoLiteParcelable.m147136g(parcel, C63204j.f170749e);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f242885b);
        parcel.writeString(this.f242889f);
        parcel.writeString(this.f242890g);
        parcel.writeString(this.f242886c);
        parcel.writeInt(this.f242891h);
        parcel.writeInt(this.f242892i);
        parcel.writeString(this.f242887d);
        parcel.writeString(this.f242888e);
        parcel.writeInt(this.f242893j ? 1 : 0);
        parcel.writeInt(this.f242894k ? 1 : 0);
        parcel.writeInt(this.f242895l ? 1 : 0);
        parcel.writeString(this.f242896m);
        ProtoLiteParcelable.m147141l(this.f242897n, parcel);
    }

    public ExplorePivotItem(C54084ah ahVar) {
        C54079ac acVar;
        C58838bb.m90868c(ahVar.f141912a == 1);
        if (ahVar.f141912a == 1) {
            acVar = (C54079ac) ahVar.f141913b;
        } else {
            acVar = C54079ac.f141889k;
        }
        String obj = Html.fromHtml(acVar.f141895e).toString();
        this.f242885b = obj;
        this.f242889f = Html.fromHtml(acVar.f141896f).toString();
        C8441b bVar = acVar.f141892b;
        String str = (bVar == null ? C8441b.f29337b : bVar).f29339a;
        this.f242890g = str;
        C58838bb.m90868c(!TextUtils.isEmpty(obj));
        C58838bb.m90868c(true ^ TextUtils.isEmpty(str));
        C63204j jVar = ahVar.f141914c;
        this.f242897n = jVar == null ? C63204j.f170749e : jVar;
        if ((acVar.f141891a & 2) != 0) {
            C8435b bVar2 = acVar.f141893c;
            C8437d dVar = (bVar2 == null ? C8435b.f29324c : bVar2).f29327b;
            C8441b bVar3 = ((C8439f) (dVar == null ? C8437d.f29329b : dVar).f29331a.get(0)).f29334a;
            this.f242886c = (bVar3 == null ? C8441b.f29337b : bVar3).f29339a;
            C8435b bVar4 = acVar.f141893c;
            C8437d dVar2 = (bVar4 == null ? C8435b.f29324c : bVar4).f29327b;
            this.f242891h = ((C8439f) (dVar2 == null ? C8437d.f29329b : dVar2).f29331a.get(0)).f29335b;
            C8435b bVar5 = acVar.f141893c;
            C8437d dVar3 = (bVar5 == null ? C8435b.f29324c : bVar5).f29327b;
            this.f242892i = ((C8439f) (dVar3 == null ? C8437d.f29329b : dVar3).f29331a.get(0)).f29336c;
        } else {
            this.f242886c = BuildConfig.FLAVOR;
            this.f242891h = 0;
            this.f242892i = 0;
        }
        if ((acVar.f141891a & 32) != 0) {
            this.f242888e = Html.fromHtml(acVar.f141897g).toString();
        } else {
            this.f242888e = Uri.parse(str).getHost();
        }
        if ((acVar.f141891a & 64) != 0) {
            C8435b bVar6 = acVar.f141898h;
            C8437d dVar4 = (bVar6 == null ? C8435b.f29324c : bVar6).f29327b;
            C8441b bVar7 = ((C8439f) (dVar4 == null ? C8437d.f29329b : dVar4).f29331a.get(0)).f29334a;
            this.f242887d = (bVar7 == null ? C8441b.f29337b : bVar7).f29339a;
        } else {
            this.f242887d = null;
        }
        this.f242893j = acVar.f141899i;
        this.f242894k = acVar.f141894d;
        C54102az azVar = acVar.f141900j;
        this.f242895l = (azVar == null ? C54102az.f141951c : azVar).f141953a;
        C54102az azVar2 = acVar.f141900j;
        this.f242896m = (azVar2 == null ? C54102az.f141951c : azVar2).f141954b;
    }
}
