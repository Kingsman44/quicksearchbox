package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c;
import com.google.android.apps.gsa.search.shared.media.C87596t;
import com.google.android.apps.gsa.staticplugins.p7613bw.C97304a;
import com.google.p4152bb.p4153a.C55018cv;
import com.google.p4152bb.p4153a.C55133hb;
import com.google.p4152bb.p4153a.C55134hc;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55157hz;
import com.google.p4152bb.p4153a.C55160ib;
import com.google.p4152bb.p4153a.C55162id;
import com.google.p4152bb.p4153a.C55163ie;
import com.google.p4152bb.p4153a.C55211jz;
import com.google.p4152bb.p4153a.C55213ka;
import com.google.p4152bb.p4153a.C55234kv;
import com.google.p4152bb.p4153a.C55235kw;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.Arrays;

/* compiled from: PG */
public class MediaControlArgument extends EntityArgument {
    public static final Parcelable.Creator CREATOR = new C87453q();

    /* renamed from: m */
    static final EntityArgument.Entity f236192m = new EntityArgument.Entity(BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, (Bitmap) null, 1, BuildConfig.FLAVOR, (String) null, (String) null, (C55136he) null, Arrays.asList(new C55018cv[]{C55018cv.CLIENT}), true, 0);

    /* renamed from: o */
    private C55160ib f236193o = C55160ib.INVALID_COMMAND;

    /* renamed from: p */
    private boolean f236194p;

    /* renamed from: q */
    private C87596t f236195q = C87596t.NONE;

    /* renamed from: r */
    private final int f236196r;

    /* renamed from: s */
    private C97304a f236197s;

    public MediaControlArgument(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f236196r = C55162id.m87613a(parcel.readInt());
        this.f236193o = C55160ib.m87611a(parcel.readInt());
        this.f236194p = parcel.readInt() != 1 ? false : true;
        this.f236195q = C87596t.m142396a(parcel.readString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        if (android.text.TextUtils.isEmpty(((com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument.Entity) r0).f236170b) == false) goto L_0x0054;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo81266F(com.google.p4152bb.p4153a.C55005ci r4) {
        /*
            r3 = this;
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55013cq.f144734d
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r4.mo58887l(r0)
            com.google.protobuf.bf r1 = r4.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r1.mo58857o(r0)
            if (r0 == 0) goto L_0x0060
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55013cq.f144734d
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r4.mo58887l(r0)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r1 = r0.f169971d
            java.lang.Object r4 = r4.mo58854l(r1)
            if (r4 != 0) goto L_0x0029
            java.lang.Object r4 = r0.f169969b
            goto L_0x002d
        L_0x0029:
            java.lang.Object r4 = r0.mo58889c(r4)
        L_0x002d:
            com.google.bb.a.cq r4 = (com.google.p4152bb.p4153a.C55013cq) r4
            int r0 = r3.f236196r
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x005f
            boolean r0 = r4.f144736a
            if (r0 == 0) goto L_0x0054
            boolean r0 = r3.mo81263C()
            if (r0 == 0) goto L_0x0053
            java.lang.Object r0 = r3.f236203n
            com.google.android.apps.gsa.search.shared.contact.Disambiguation r0 = (com.google.android.apps.gsa.search.shared.contact.Disambiguation) r0
            android.os.Parcelable r0 = r0.f236364c
            r0.getClass()
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument$Entity r0 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument.Entity) r0
            android.text.Spanned r0 = r0.f236170b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            return r2
        L_0x0054:
            boolean r0 = r3.f236194p
            if (r0 != 0) goto L_0x005e
            boolean r4 = r4.f144737b
            if (r4 != 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            return r2
        L_0x005e:
            return r1
        L_0x005f:
            return r2
        L_0x0060:
            boolean r4 = super.mo81266F(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.modular.arguments.MediaControlArgument.mo81266F(com.google.bb.a.ci):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final C55213ka mo81299M(boolean z) {
        Object obj;
        C55213ka M = super.mo81299M(z);
        C62940bt r0 = C62942bv.checkIsLite(C55235kw.f145427j);
        M.mo58887l(r0);
        if (!M.f169962ag.mo58857o(r0.f169971d)) {
            return M;
        }
        C55157hz hzVar = (C55157hz) C55163ie.f145233d.createBuilder();
        int i = this.f236196r;
        hzVar.copyOnWrite();
        C55163ie ieVar = (C55163ie) hzVar.instance;
        int i2 = i - 1;
        if (i != 0) {
            ieVar.f145238c = i2;
            ieVar.f145236a |= 2;
            C55160ib ibVar = this.f236193o;
            hzVar.copyOnWrite();
            C55163ie ieVar2 = (C55163ie) hzVar.instance;
            ieVar2.f145237b = ibVar.f145231q;
            ieVar2.f145236a |= 1;
            C55163ie ieVar3 = (C55163ie) hzVar.build();
            C55211jz jzVar = (C55211jz) M.toBuilder();
            C62940bt btVar = C55235kw.f145427j;
            C62940bt r3 = C62942bv.checkIsLite(btVar);
            M.mo58887l(r3);
            Object l = M.f169962ag.mo58854l(r3.f169971d);
            if (l == null) {
                obj = r3.f169969b;
            } else {
                obj = r3.mo58889c(l);
            }
            C55234kv kvVar = (C55234kv) ((C55235kw) obj).toBuilder();
            kvVar.mo58885m(C55163ie.f145234e, ieVar3);
            jzVar.mo58885m(btVar, (C55235kw) kvVar.build());
            return (C55213ka) jzVar.build();
        }
        throw null;
    }

    /* renamed from: c */
    public final C87429c mo81250c(C87449m mVar, C55134hc hcVar, Resources resources) {
        C55133hb hbVar = C55133hb.NONE;
        C55133hb a = C55133hb.m87600a(hcVar.f145123c);
        if (a == null) {
            a = C55133hb.NONE;
        }
        int ordinal = a.ordinal();
        if (ordinal == 40) {
            return this.f236193o != C55160ib.INVALID_COMMAND ? new C87429c(this.f236193o.f145231q) : C87429c.f236122a;
        }
        if (ordinal != 41) {
            return super.mo81250c(mVar, hcVar, resources);
        }
        String str = this.f236165j;
        return !TextUtils.isEmpty(str) ? new C87429c(str) : C87429c.f236122a;
    }

    /* renamed from: h */
    public final /* synthetic */ EntityArgument mo81301h(int i) {
        return new MediaControlArgument(this, i);
    }

    /* renamed from: hB */
    public final boolean mo81260hB() {
        return false;
    }

    /* renamed from: m */
    public final /* synthetic */ Argument mo81278m(int i) {
        return new MediaControlArgument(this, i);
    }

    /* renamed from: p */
    public final Object mo81281p(C87440d dVar) {
        return dVar.mo81359f(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int i2 = this.f236196r;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            parcel.writeInt(this.f236193o.f145231q);
            parcel.writeInt(this.f236194p ? 1 : 0);
            parcel.writeString(this.f236195q.name());
            return;
        }
        throw null;
    }

    private MediaControlArgument(MediaControlArgument mediaControlArgument, int i) {
        super((EntityArgument) mediaControlArgument, i);
        this.f236196r = mediaControlArgument.f236196r;
        this.f236193o = mediaControlArgument.f236193o;
        this.f236194p = mediaControlArgument.f236194p;
        this.f236195q = mediaControlArgument.f236195q;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010b, code lost:
        if ((r4 & r7.longValue()) == 0) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0119, code lost:
        if ((r4 & 512) <= 0) goto L_0x0145;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x014d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MediaControlArgument(com.google.p4152bb.p4153a.C55213ka r21, com.google.android.apps.gsa.search.shared.media.PlaybackStatus r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = 1
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument$Entity[] r4 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument.Entity[r3]
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument$Entity r5 = f236192m
            r6 = 0
            r4[r6] = r5
            java.util.ArrayList r4 = com.google.common.p4522b.C58597ky.m90212c(r4)
            r0.<init>((com.google.p4152bb.p4153a.C55213ka) r1, (java.util.List) r4)
            com.google.bb.a.ib r4 = com.google.p4152bb.p4153a.C55160ib.INVALID_COMMAND
            r0.f236193o = r4
            com.google.android.apps.gsa.search.shared.media.t r4 = com.google.android.apps.gsa.search.shared.media.C87596t.NONE
            r0.f236195q = r4
            com.google.protobuf.bt r4 = com.google.p4152bb.p4153a.C55235kw.f145427j
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r1.mo58887l(r4)
            com.google.protobuf.bf r1 = r1.f169962ag
            com.google.protobuf.bs r5 = r4.f169971d
            java.lang.Object r1 = r1.mo58854l(r5)
            if (r1 != 0) goto L_0x0033
            java.lang.Object r1 = r4.f169969b
            goto L_0x0037
        L_0x0033:
            java.lang.Object r1 = r4.mo58889c(r1)
        L_0x0037:
            com.google.bb.a.kw r1 = (com.google.p4152bb.p4153a.C55235kw) r1
            com.google.protobuf.bt r4 = com.google.p4152bb.p4153a.C55163ie.f145234e
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r1.mo58887l(r4)
            com.google.protobuf.bf r5 = r1.f169962ag
            com.google.protobuf.bs r4 = r4.f169971d
            boolean r4 = r5.mo58857o(r4)
            if (r4 == 0) goto L_0x0080
            com.google.protobuf.bt r4 = com.google.p4152bb.p4153a.C55163ie.f145234e
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r1.mo58887l(r4)
            com.google.protobuf.bf r1 = r1.f169962ag
            com.google.protobuf.bs r5 = r4.f169971d
            java.lang.Object r1 = r1.mo58854l(r5)
            if (r1 != 0) goto L_0x0062
            java.lang.Object r1 = r4.f169969b
            goto L_0x0066
        L_0x0062:
            java.lang.Object r1 = r4.mo58889c(r1)
        L_0x0066:
            com.google.bb.a.ie r1 = (com.google.p4152bb.p4153a.C55163ie) r1
            int r4 = r1.f145238c
            int r4 = com.google.p4152bb.p4153a.C55162id.m87613a(r4)
            if (r4 != 0) goto L_0x0071
            r4 = 1
        L_0x0071:
            r0.f236196r = r4
            int r1 = r1.f145237b
            com.google.bb.a.ib r1 = com.google.p4152bb.p4153a.C55160ib.m87611a(r1)
            if (r1 != 0) goto L_0x007d
            com.google.bb.a.ib r1 = com.google.p4152bb.p4153a.C55160ib.INVALID_COMMAND
        L_0x007d:
            r0.f236193o = r1
            goto L_0x0086
        L_0x0080:
            r0.f236196r = r3
            com.google.bb.a.ib r1 = com.google.p4152bb.p4153a.C55160ib.INVALID_COMMAND
            r0.f236193o = r1
        L_0x0086:
            if (r2 == 0) goto L_0x017a
            com.google.android.apps.gsa.search.shared.media.t r1 = r2.f236604a
            if (r1 == 0) goto L_0x017a
            com.google.android.apps.gsa.search.shared.media.t r4 = com.google.android.apps.gsa.search.shared.media.C87596t.NONE
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x017a
            java.lang.String r1 = r2.f236606c
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x009e
            goto L_0x017a
        L_0x009e:
            java.lang.String r1 = r2.f236609f
            r0.f236165j = r1
            java.lang.String r13 = r2.f236606c
            java.lang.String r1 = r2.f236605b
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L_0x00ba
            java.lang.String r1 = r2.f236607d
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x00b7
            java.lang.String r1 = ""
            goto L_0x00d1
        L_0x00b7:
            java.lang.String r1 = r2.f236607d
            goto L_0x00d1
        L_0x00ba:
            java.lang.String r4 = r2.f236607d
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x00d1
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r6] = r1
            java.lang.String r1 = r2.f236607d
            r4[r3] = r1
            java.lang.String r1 = "%s<br>%s"
            java.lang.String r1 = java.lang.String.format(r1, r4)
        L_0x00d1:
            r9 = r1
            com.google.android.apps.gsa.staticplugins.bw.a r1 = r2.f236616m
            if (r1 == 0) goto L_0x00d8
            r0.f236197s = r1
        L_0x00d8:
            com.google.android.apps.gsa.staticplugins.bw.a r1 = r0.f236197s
            if (r1 == 0) goto L_0x0150
            com.google.bb.a.ib r1 = r0.f236193o
            long r4 = r2.f236611h
            int r7 = r1.ordinal()
            if (r7 == 0) goto L_0x0145
            r8 = 6
            r10 = 1
            r14 = 2
            r16 = 512(0x200, double:2.53E-321)
            r18 = 0
            if (r7 == r8) goto L_0x0130
            r8 = 3
            if (r7 == r8) goto L_0x011c
            r8 = 4
            if (r7 == r8) goto L_0x010e
            com.google.common.b.hd r7 = com.google.android.apps.gsa.staticplugins.p7613bw.C97310g.f271757a
            java.lang.Object r7 = r7.get(r1)
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 != 0) goto L_0x0104
            com.google.bb.a.ib r1 = com.google.p4152bb.p4153a.C55160ib.INVALID_COMMAND
            goto L_0x0147
        L_0x0104:
            long r7 = r7.longValue()
            long r4 = r4 & r7
            int r7 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r7 != 0) goto L_0x0147
            goto L_0x0145
        L_0x010e:
            r7 = 4
            long r7 = r7 & r4
            int r10 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r10 > 0) goto L_0x0147
            long r4 = r4 & r16
            int r7 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r7 > 0) goto L_0x0147
            goto L_0x0145
        L_0x011c:
            long r7 = r4 & r14
            int r12 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r12 > 0) goto L_0x0147
            long r7 = r4 & r16
            int r12 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r12 > 0) goto L_0x0147
            long r4 = r4 & r10
            int r1 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r1 <= 0) goto L_0x0145
            com.google.bb.a.ib r1 = com.google.p4152bb.p4153a.C55160ib.STOP
            goto L_0x0147
        L_0x0130:
            long r7 = r4 & r10
            int r10 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r10 > 0) goto L_0x0147
            long r7 = r4 & r14
            int r1 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r1 > 0) goto L_0x0142
            long r4 = r4 & r16
            int r1 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r1 <= 0) goto L_0x0145
        L_0x0142:
            com.google.bb.a.ib r1 = com.google.p4152bb.p4153a.C55160ib.PAUSE
            goto L_0x0147
        L_0x0145:
            com.google.bb.a.ib r1 = com.google.p4152bb.p4153a.C55160ib.INVALID_COMMAND
        L_0x0147:
            com.google.bb.a.ib r4 = com.google.p4152bb.p4153a.C55160ib.INVALID_COMMAND
            if (r1 == r4) goto L_0x014d
            r1 = 1
            goto L_0x014e
        L_0x014d:
            r1 = 0
        L_0x014e:
            r0.f236194p = r1
        L_0x0150:
            com.google.android.apps.gsa.search.shared.media.t r1 = r2.f236604a
            r0.f236195q = r1
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument$Entity r1 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument$Entity
            android.graphics.Bitmap r11 = r2.f236608e
            com.google.bb.a.cv[] r2 = new com.google.p4152bb.p4153a.C55018cv[r3]
            com.google.bb.a.cv r3 = com.google.p4152bb.p4153a.C55018cv.CLIENT
            r2[r6] = r3
            java.lang.String r10 = ""
            r12 = 1
            r14 = 0
            r15 = 0
            r16 = 0
            java.util.List r17 = java.util.Arrays.asList(r2)
            r18 = 1
            r19 = 0
            r7 = r1
            r8 = r13
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r2 = r0.f236203n
            com.google.android.apps.gsa.search.shared.contact.Disambiguation r2 = (com.google.android.apps.gsa.search.shared.contact.Disambiguation) r2
            r2.mo81535d(r1, r6)
            return
        L_0x017a:
            r0.f236194p = r6
            com.google.android.apps.gsa.search.shared.media.t r1 = com.google.android.apps.gsa.search.shared.media.C87596t.NONE
            r0.f236195q = r1
            r20.mo81287v()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.modular.arguments.MediaControlArgument.<init>(com.google.bb.a.ka, com.google.android.apps.gsa.search.shared.media.PlaybackStatus):void");
    }
}
