package com.google.android.libraries.p11002ag;

import com.evernote.android.state.BuildConfig;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.ag.i */
/* compiled from: PG */
public class C147579i implements Externalizable {
    private static final long serialVersionUID = 1;

    /* renamed from: A */
    private boolean f398307A;

    /* renamed from: B */
    private boolean f398308B;

    /* renamed from: C */
    private boolean f398309C;

    /* renamed from: D */
    private boolean f398310D;

    /* renamed from: E */
    private boolean f398311E;

    /* renamed from: F */
    private boolean f398312F;

    /* renamed from: G */
    private boolean f398313G;

    /* renamed from: H */
    private boolean f398314H;

    /* renamed from: I */
    private boolean f398315I;

    /* renamed from: J */
    private boolean f398316J;

    /* renamed from: K */
    private boolean f398317K;

    /* renamed from: L */
    private boolean f398318L;

    /* renamed from: M */
    private C147581k f398319M = null;

    /* renamed from: N */
    private boolean f398320N;

    /* renamed from: O */
    private C147581k f398321O = null;

    /* renamed from: P */
    private boolean f398322P;

    /* renamed from: Q */
    private C147581k f398323Q = null;

    /* renamed from: R */
    private boolean f398324R;

    /* renamed from: S */
    private C147581k f398325S = null;

    /* renamed from: T */
    private boolean f398326T;

    /* renamed from: U */
    private C147581k f398327U = null;

    /* renamed from: V */
    private boolean f398328V;

    /* renamed from: W */
    private String f398329W = BuildConfig.FLAVOR;

    /* renamed from: X */
    private boolean f398330X;

    /* renamed from: Y */
    private String f398331Y = BuildConfig.FLAVOR;

    /* renamed from: Z */
    private boolean f398332Z;

    /* renamed from: a */
    public C147581k f398333a = null;

    /* renamed from: aa */
    private boolean f398334aa = false;

    /* renamed from: ab */
    private boolean f398335ab = false;

    /* renamed from: ac */
    private boolean f398336ac = false;

    /* renamed from: b */
    public C147581k f398337b = null;

    /* renamed from: c */
    public C147581k f398338c = null;

    /* renamed from: d */
    public C147581k f398339d = null;

    /* renamed from: e */
    public C147581k f398340e = null;

    /* renamed from: f */
    public C147581k f398341f = null;

    /* renamed from: g */
    public C147581k f398342g = null;

    /* renamed from: h */
    public C147581k f398343h = null;

    /* renamed from: i */
    public C147581k f398344i = null;

    /* renamed from: j */
    public C147581k f398345j = null;

    /* renamed from: k */
    public boolean f398346k;

    /* renamed from: l */
    public C147581k f398347l = null;

    /* renamed from: m */
    public C147581k f398348m = null;

    /* renamed from: n */
    public String f398349n = BuildConfig.FLAVOR;

    /* renamed from: o */
    public int f398350o = 0;

    /* renamed from: p */
    public String f398351p = BuildConfig.FLAVOR;

    /* renamed from: q */
    public boolean f398352q;

    /* renamed from: r */
    public String f398353r = BuildConfig.FLAVOR;

    /* renamed from: s */
    public boolean f398354s;

    /* renamed from: t */
    public String f398355t = BuildConfig.FLAVOR;

    /* renamed from: u */
    public String f398356u = BuildConfig.FLAVOR;

    /* renamed from: v */
    public boolean f398357v = false;

    /* renamed from: w */
    public final List f398358w = new ArrayList();

    /* renamed from: x */
    public final List f398359x = new ArrayList();

    /* renamed from: y */
    public boolean f398360y;

    /* renamed from: z */
    public String f398361z = BuildConfig.FLAVOR;

    /* renamed from: a */
    public void mo124336a(String str) {
        this.f398349n = str;
    }

    /* renamed from: b */
    public void mo124337b(String str) {
        this.f398351p = str;
    }

    /* renamed from: c */
    public final int mo124338c() {
        return this.f398359x.size();
    }

    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            C147581k kVar = new C147581k();
            kVar.readExternal(objectInput);
            this.f398307A = true;
            this.f398333a = kVar;
        }
        if (objectInput.readBoolean()) {
            C147581k kVar2 = new C147581k();
            kVar2.readExternal(objectInput);
            this.f398308B = true;
            this.f398337b = kVar2;
        }
        if (objectInput.readBoolean()) {
            C147581k kVar3 = new C147581k();
            kVar3.readExternal(objectInput);
            this.f398309C = true;
            this.f398338c = kVar3;
        }
        if (objectInput.readBoolean()) {
            C147581k kVar4 = new C147581k();
            kVar4.readExternal(objectInput);
            this.f398310D = true;
            this.f398339d = kVar4;
        }
        if (objectInput.readBoolean()) {
            C147581k kVar5 = new C147581k();
            kVar5.readExternal(objectInput);
            this.f398311E = true;
            this.f398340e = kVar5;
        }
        if (objectInput.readBoolean()) {
            C147581k kVar6 = new C147581k();
            kVar6.readExternal(objectInput);
            this.f398312F = true;
            this.f398341f = kVar6;
        }
        if (objectInput.readBoolean()) {
            C147581k kVar7 = new C147581k();
            kVar7.readExternal(objectInput);
            this.f398313G = true;
            this.f398342g = kVar7;
        }
        if (objectInput.readBoolean()) {
            C147581k kVar8 = new C147581k();
            kVar8.readExternal(objectInput);
            this.f398314H = true;
            this.f398343h = kVar8;
        }
        if (objectInput.readBoolean()) {
            C147581k kVar9 = new C147581k();
            kVar9.readExternal(objectInput);
            this.f398315I = true;
            this.f398344i = kVar9;
        }
        if (objectInput.readBoolean()) {
            C147581k kVar10 = new C147581k();
            kVar10.readExternal(objectInput);
            this.f398316J = true;
            this.f398345j = kVar10;
        }
        if (objectInput.readBoolean()) {
            C147581k kVar11 = new C147581k();
            kVar11.readExternal(objectInput);
            this.f398346k = true;
            this.f398347l = kVar11;
        }
        if (objectInput.readBoolean()) {
            C147581k kVar12 = new C147581k();
            kVar12.readExternal(objectInput);
            this.f398317K = true;
            this.f398348m = kVar12;
        }
        if (objectInput.readBoolean()) {
            C147581k kVar13 = new C147581k();
            kVar13.readExternal(objectInput);
            this.f398318L = true;
            this.f398319M = kVar13;
        }
        if (objectInput.readBoolean()) {
            C147581k kVar14 = new C147581k();
            kVar14.readExternal(objectInput);
            this.f398320N = true;
            this.f398321O = kVar14;
        }
        if (objectInput.readBoolean()) {
            C147581k kVar15 = new C147581k();
            kVar15.readExternal(objectInput);
            this.f398322P = true;
            this.f398323Q = kVar15;
        }
        if (objectInput.readBoolean()) {
            C147581k kVar16 = new C147581k();
            kVar16.readExternal(objectInput);
            this.f398324R = true;
            this.f398325S = kVar16;
        }
        if (objectInput.readBoolean()) {
            C147581k kVar17 = new C147581k();
            kVar17.readExternal(objectInput);
            this.f398326T = true;
            this.f398327U = kVar17;
        }
        mo124336a(objectInput.readUTF());
        this.f398350o = objectInput.readInt();
        mo124337b(objectInput.readUTF());
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.f398328V = true;
            this.f398329W = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.f398330X = true;
            this.f398331Y = readUTF2;
        }
        if (objectInput.readBoolean()) {
            String readUTF3 = objectInput.readUTF();
            this.f398352q = true;
            this.f398353r = readUTF3;
        }
        if (objectInput.readBoolean()) {
            String readUTF4 = objectInput.readUTF();
            this.f398354s = true;
            this.f398355t = readUTF4;
        }
        if (objectInput.readBoolean()) {
            String readUTF5 = objectInput.readUTF();
            this.f398332Z = true;
            this.f398356u = readUTF5;
        }
        this.f398357v = objectInput.readBoolean();
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            C147577g gVar = new C147577g();
            gVar.readExternal(objectInput);
            this.f398358w.add(gVar);
        }
        int readInt2 = objectInput.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            C147577g gVar2 = new C147577g();
            gVar2.readExternal(objectInput);
            this.f398359x.add(gVar2);
        }
        this.f398334aa = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            String readUTF6 = objectInput.readUTF();
            this.f398360y = true;
            this.f398361z = readUTF6;
        }
        this.f398335ab = objectInput.readBoolean();
        this.f398336ac = objectInput.readBoolean();
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.f398307A);
        if (this.f398307A) {
            this.f398333a.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f398308B);
        if (this.f398308B) {
            this.f398337b.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f398309C);
        if (this.f398309C) {
            this.f398338c.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f398310D);
        if (this.f398310D) {
            this.f398339d.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f398311E);
        if (this.f398311E) {
            this.f398340e.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f398312F);
        if (this.f398312F) {
            this.f398341f.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f398313G);
        if (this.f398313G) {
            this.f398342g.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f398314H);
        if (this.f398314H) {
            this.f398343h.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f398315I);
        if (this.f398315I) {
            this.f398344i.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f398316J);
        if (this.f398316J) {
            this.f398345j.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f398346k);
        if (this.f398346k) {
            this.f398347l.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f398317K);
        if (this.f398317K) {
            this.f398348m.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f398318L);
        if (this.f398318L) {
            this.f398319M.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f398320N);
        if (this.f398320N) {
            this.f398321O.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f398322P);
        if (this.f398322P) {
            this.f398323Q.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f398324R);
        if (this.f398324R) {
            this.f398325S.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f398326T);
        if (this.f398326T) {
            this.f398327U.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.f398349n);
        objectOutput.writeInt(this.f398350o);
        objectOutput.writeUTF(this.f398351p);
        objectOutput.writeBoolean(this.f398328V);
        if (this.f398328V) {
            objectOutput.writeUTF(this.f398329W);
        }
        objectOutput.writeBoolean(this.f398330X);
        if (this.f398330X) {
            objectOutput.writeUTF(this.f398331Y);
        }
        objectOutput.writeBoolean(this.f398352q);
        if (this.f398352q) {
            objectOutput.writeUTF(this.f398353r);
        }
        objectOutput.writeBoolean(this.f398354s);
        if (this.f398354s) {
            objectOutput.writeUTF(this.f398355t);
        }
        objectOutput.writeBoolean(this.f398332Z);
        if (this.f398332Z) {
            objectOutput.writeUTF(this.f398356u);
        }
        objectOutput.writeBoolean(this.f398357v);
        int size = this.f398358w.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((C147577g) this.f398358w.get(i)).writeExternal(objectOutput);
        }
        int c = mo124338c();
        objectOutput.writeInt(c);
        for (int i2 = 0; i2 < c; i2++) {
            ((C147577g) this.f398359x.get(i2)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f398334aa);
        objectOutput.writeBoolean(this.f398360y);
        if (this.f398360y) {
            objectOutput.writeUTF(this.f398361z);
        }
        objectOutput.writeBoolean(this.f398335ab);
        objectOutput.writeBoolean(this.f398336ac);
    }
}
