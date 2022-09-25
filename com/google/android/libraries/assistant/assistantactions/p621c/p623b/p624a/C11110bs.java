package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.p620b.C11054a;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3917i.p3918a.C51401gi;
import com.google.assistant.p3897e.p3917i.p3918a.C51406gn;
import com.google.assistant.p3897e.p3917i.p3918a.C51458il;
import com.google.assistant.p3897e.p3917i.p3918a.C51465is;
import com.google.assistant.p3897e.p3917i.p3918a.C51466it;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52069eb;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52214jl;
import com.google.assistant.p3897e.p3921j.C52215jm;
import com.google.assistant.p3897e.p3921j.C52217jo;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52308my;
import com.google.assistant.p3897e.p3921j.C52311na;
import com.google.assistant.p3897e.p3921j.C52312nb;
import com.google.assistant.p3897e.p3921j.C52321nk;
import com.google.assistant.p3897e.p3921j.C52374pj;
import com.google.assistant.p3897e.p3921j.C52613yf;
import com.google.assistant.p3897e.p3921j.C52617yj;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.assistant.p3897e.p3921j.C52627yt;
import com.google.assistant.p3897e.p3921j.C52633yz;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.bs */
/* compiled from: PG */
public final class C11110bs {

    /* renamed from: a */
    static final C51809dy f36415a;

    /* renamed from: b */
    public static final /* synthetic */ int f36416b = 0;

    /* renamed from: c */
    private static final C59071e f36417c = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.c.b.a.bs");

    static {
        C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
        dxVar.copyOnWrite();
        C51809dy dyVar = (C51809dy) dxVar.instance;
        dyVar.f135935a |= 1;
        dyVar.f135936b = "core.DISMISS_ASSISTANT";
        f36415a = (C51809dy) dxVar.build();
    }

    /* renamed from: A */
    public static boolean m26367A(C51401gi giVar) {
        C51465is isVar = C51465is.UNKNOWN;
        C51401gi giVar2 = C51401gi.CONTROLLER_STATE_UNKNOWN;
        int ordinal = giVar.ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 5 || ordinal == 6 || ordinal == 11 || ordinal == 17;
    }

    /* renamed from: a */
    public static C51098gh m26368a(C51098gh ghVar, C58833ax axVar) {
        C51058ev evVar;
        C51058ev evVar2;
        C51058ev evVar3;
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        if ((evVar.f132943a & 1) == 0 || !axVar.mo56113h()) {
            return ghVar;
        }
        C52613yf yfVar = ((C52633yz) axVar.mo56107c()).f138197d;
        if (yfVar == null) {
            yfVar = C52613yf.f138138f;
        }
        if ((yfVar.f138140a & 4) == 0 || (((C52633yz) axVar.mo56107c()).f138194a & 8) == 0) {
            return ghVar;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        if (ghVar.f133012b == 1) {
            evVar2 = (C51058ev) ghVar.f133013c;
        } else {
            evVar2 = C51058ev.f132941o;
        }
        intent.setPackage(evVar2.f132944b);
        Uri parse = Uri.parse("content://com.android.contacts/data/" + ((C52633yz) axVar.mo56107c()).f138198e);
        C52613yf yfVar2 = ((C52633yz) axVar.mo56107c()).f138197d;
        if (yfVar2 == null) {
            yfVar2 = C52613yf.f138138f;
        }
        intent.setDataAndType(parse, yfVar2.f138143d);
        C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
        if (ghVar.f133012b == 1) {
            evVar3 = (C51058ev) ghVar.f133013c;
        } else {
            evVar3 = C51058ev.f132941o;
        }
        String str = evVar3.f132944b;
        esVar.copyOnWrite();
        C51058ev evVar4 = (C51058ev) esVar.instance;
        str.getClass();
        evVar4.f132943a |= 1;
        evVar4.f132944b = str;
        String uri = intent.toUri(0);
        esVar.copyOnWrite();
        C51058ev evVar5 = (C51058ev) esVar.instance;
        uri.getClass();
        evVar5.f132943a |= 32;
        evVar5.f132949g = uri;
        C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
        ggVar.copyOnWrite();
        C51098gh ghVar2 = (C51098gh) ggVar.instance;
        C51058ev evVar6 = (C51058ev) esVar.build();
        evVar6.getClass();
        ghVar2.f133013c = evVar6;
        ghVar2.f133012b = 1;
        return (C51098gh) ggVar.build();
    }

    /* renamed from: b */
    public static C51098gh m26369b(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
        String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context);
        if (defaultSmsPackage != null) {
            esVar.copyOnWrite();
            C51058ev evVar = (C51058ev) esVar.instance;
            evVar.f132943a |= 1;
            evVar.f132944b = defaultSmsPackage;
        } else {
            String uri = intent.toUri(0);
            esVar.copyOnWrite();
            C51058ev evVar2 = (C51058ev) esVar.instance;
            uri.getClass();
            evVar2.f132943a |= 32;
            evVar2.f132949g = uri;
        }
        C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
        ggVar.copyOnWrite();
        C51098gh ghVar = (C51098gh) ggVar.instance;
        C51058ev evVar3 = (C51058ev) esVar.build();
        evVar3.getClass();
        ghVar.f133013c = evVar3;
        ghVar.f133012b = 1;
        return (C51098gh) ggVar.build();
    }

    /* renamed from: c */
    public static C51809dy m26370c(List list) {
        C52214jl jlVar = (C52214jl) C52215jm.f137024b.createBuilder();
        jlVar.mo53817a(list);
        return C11209d.m26575e("photos.DOWNLOAD_PHOTOS", "download_photos_args", "assistant.api.proto.AssistantPhotosClientOp.DownloadPhotosArgs", (C52215jm) jlVar.build());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v68, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v75, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.assistant.p3897e.p3921j.C51809dy m26371d(com.google.assistant.p3897e.p3921j.C52374pj r7, java.lang.String r8, com.google.common.base.C58833ax r9, com.google.common.base.C58833ax r10, com.google.common.base.C58833ax r11) {
        /*
            com.google.assistant.s.a.ih r0 = com.google.assistant.p3994s.p3995a.C53287ih.f139693l
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.s.a.hw r0 = (com.google.assistant.p3994s.p3995a.C53275hw) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.s.a.ih r1 = (com.google.assistant.p3994s.p3995a.C53287ih) r1
            r2 = 3
            r1.f139698d = r2
            int r3 = r1.f139695a
            r4 = 1
            r3 = r3 | r4
            r1.f139695a = r3
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.s.a.ih r1 = (com.google.assistant.p3994s.p3995a.C53287ih) r1
            r1.f139702h = r4
            int r3 = r1.f139695a
            r3 = r3 | 64
            r1.f139695a = r3
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.s.a.ih r1 = (com.google.assistant.p3994s.p3995a.C53287ih) r1
            r3 = 25
            r1.f139703i = r3
            int r3 = r1.f139695a
            r3 = r3 | 128(0x80, float:1.794E-43)
            r1.f139695a = r3
            int r1 = r7.f137437b
            java.lang.String r3 = ""
            r5 = 2
            if (r1 != r5) goto L_0x0044
            java.lang.Object r1 = r7.f137438c
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0045
        L_0x0044:
            r1 = r3
        L_0x0045:
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0099
            int r11 = r7.f137437b
            if (r11 != r5) goto L_0x0054
            java.lang.Object r7 = r7.f137438c
            r3 = r7
            java.lang.String r3 = (java.lang.String) r3
        L_0x0054:
            java.lang.String r7 = android.telephony.PhoneNumberUtils.normalizeNumber(r3)
            com.google.assistant.s.a.bo r11 = com.google.assistant.p3994s.p3995a.C53105bo.f139161c
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.s.a.bj r11 = (com.google.assistant.p3994s.p3995a.C53100bj) r11
            com.google.assistant.s.a.bl r1 = com.google.assistant.p3994s.p3995a.C53102bl.f139153c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.s.a.bk r1 = (com.google.assistant.p3994s.p3995a.C53101bk) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.s.a.bl r3 = (com.google.assistant.p3994s.p3995a.C53102bl) r3
            r7.getClass()
            int r6 = r3.f139155a
            r6 = r6 | r4
            r3.f139155a = r6
            r3.f139156b = r7
            r11.copyOnWrite()
            com.google.protobuf.bv r7 = r11.instance
            com.google.assistant.s.a.bo r7 = (com.google.assistant.p3994s.p3995a.C53105bo) r7
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.s.a.bl r1 = (com.google.assistant.p3994s.p3995a.C53102bl) r1
            r1.getClass()
            r7.f139164b = r1
            r7.f139163a = r5
            com.google.protobuf.bv r7 = r11.build()
            com.google.assistant.s.a.bo r7 = (com.google.assistant.p3994s.p3995a.C53105bo) r7
            com.google.common.base.ax r7 = com.google.common.base.C58833ax.m90834k(r7)
            goto L_0x010f
        L_0x0099:
            int r1 = r7.f137437b
            r6 = 6
            if (r1 != r6) goto L_0x00a3
            java.lang.Object r7 = r7.f137438c
            r3 = r7
            java.lang.String r3 = (java.lang.String) r3
        L_0x00a3:
            boolean r7 = r3.isEmpty()
            if (r7 == 0) goto L_0x00ac
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            goto L_0x010f
        L_0x00ac:
            boolean r7 = r11.mo56113h()
            if (r7 == 0) goto L_0x010d
            java.lang.Object r7 = r11.mo56107c()
            com.google.assistant.e.c.c.gh r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r7
            int r11 = r7.f133012b
            if (r11 != r4) goto L_0x00c1
            java.lang.Object r7 = r7.f133013c
            com.google.assistant.e.c.c.ev r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r7
            goto L_0x00c3
        L_0x00c1:
            com.google.assistant.e.c.c.ev r7 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x00c3:
            java.lang.String r7 = r7.f132944b
            java.lang.String r11 = "com.whatsapp"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x010d
            com.google.assistant.s.a.bo r7 = com.google.assistant.p3994s.p3995a.C53105bo.f139161c
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.s.a.bj r7 = (com.google.assistant.p3994s.p3995a.C53100bj) r7
            com.google.assistant.s.a.bn r11 = com.google.assistant.p3994s.p3995a.C53104bn.f139157c
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.s.a.bm r11 = (com.google.assistant.p3994s.p3995a.C53103bm) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r1 = r11.instance
            com.google.assistant.s.a.bn r1 = (com.google.assistant.p3994s.p3995a.C53104bn) r1
            r3.getClass()
            int r6 = r1.f139159a
            r6 = r6 | r4
            r1.f139159a = r6
            r1.f139160b = r3
            r7.copyOnWrite()
            com.google.protobuf.bv r1 = r7.instance
            com.google.assistant.s.a.bo r1 = (com.google.assistant.p3994s.p3995a.C53105bo) r1
            com.google.protobuf.bv r11 = r11.build()
            com.google.assistant.s.a.bn r11 = (com.google.assistant.p3994s.p3995a.C53104bn) r11
            r11.getClass()
            r1.f139164b = r11
            r1.f139163a = r4
            com.google.protobuf.bv r7 = r7.build()
            com.google.assistant.s.a.bo r7 = (com.google.assistant.p3994s.p3995a.C53105bo) r7
            com.google.common.base.ax r7 = com.google.common.base.C58833ax.m90834k(r7)
            goto L_0x010f
        L_0x010d:
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
        L_0x010f:
            boolean r11 = r7.mo56113h()
            if (r11 != 0) goto L_0x0119
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            goto L_0x0244
        L_0x0119:
            com.google.assistant.s.a.bp r11 = com.google.assistant.p3994s.p3995a.C53106bp.f139165f
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.s.a.bi r11 = (com.google.assistant.p3994s.p3995a.C53099bi) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r1 = r11.instance
            com.google.assistant.s.a.bp r1 = (com.google.assistant.p3994s.p3995a.C53106bp) r1
            r8.getClass()
            int r3 = r1.f139167a
            r3 = r3 | r5
            r1.f139167a = r3
            r1.f139168b = r8
            java.lang.Object r7 = r7.mo56107c()
            com.google.assistant.s.a.bo r7 = (com.google.assistant.p3994s.p3995a.C53105bo) r7
            r11.copyOnWrite()
            com.google.protobuf.bv r8 = r11.instance
            com.google.assistant.s.a.bp r8 = (com.google.assistant.p3994s.p3995a.C53106bp) r8
            r7.getClass()
            r8.f139171e = r7
            int r7 = r8.f139167a
            r7 = r7 | 16
            r8.f139167a = r7
            boolean r7 = r9.mo56113h()
            if (r7 == 0) goto L_0x0174
            java.lang.Object r7 = r9.mo56107c()
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x0174
            java.lang.Object r7 = r9.mo56107c()
            java.lang.String r7 = (java.lang.String) r7
            r11.copyOnWrite()
            com.google.protobuf.bv r8 = r11.instance
            com.google.assistant.s.a.bp r8 = (com.google.assistant.p3994s.p3995a.C53106bp) r8
            r7.getClass()
            int r9 = r8.f139167a
            r9 = r9 | 4
            r8.f139167a = r9
            r8.f139169c = r7
        L_0x0174:
            boolean r7 = r10.mo56113h()
            if (r7 == 0) goto L_0x01e4
            java.lang.Object r7 = r10.mo56107c()
            com.google.assistant.e.c.c.dc r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r7
            java.lang.String r8 = r7.f132817c
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x018b
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            goto L_0x01c6
        L_0x018b:
            com.google.assistant.e.i.a.is r8 = com.google.assistant.p3897e.p3917i.p3918a.C51465is.UNKNOWN
            com.google.assistant.e.i.a.gi r8 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.CONTROLLER_STATE_UNKNOWN
            int r8 = r7.f132816b
            int r8 = com.google.assistant.p3897e.p3902c.p3907c.C51014de.m86008a(r8)
            if (r8 != 0) goto L_0x0198
            r8 = 1
        L_0x0198:
            int r8 = r8 + -1
            if (r8 == 0) goto L_0x01c0
            if (r8 == r2) goto L_0x01af
            com.google.common.f.e r7 = f36417c
            com.google.common.f.x r7 = r7.mo56226d()
            java.lang.String r8 = "Contact image type not recognized, returning empty image."
            r9 = 43020(0xa80c, float:6.0284E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r9)).mo56386p(r8)
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            goto L_0x01c6
        L_0x01af:
            java.lang.String r7 = r7.f132817c
            java.lang.Long r7 = com.google.common.p4575r.C60761r.m92762h(r7)
            com.google.common.base.ax r7 = com.google.common.base.C58833ax.m90833j(r7)
            com.google.android.libraries.assistant.assistantactions.c.b.a.br r8 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11109br.f36414a
            com.google.common.base.ax r7 = r7.mo56106b(r8)
            goto L_0x01c6
        L_0x01c0:
            java.lang.String r7 = r7.f132817c
            com.google.common.base.ax r7 = com.google.common.base.C58833ax.m90834k(r7)
        L_0x01c6:
            boolean r8 = r7.mo56113h()
            if (r8 == 0) goto L_0x01e4
            java.lang.Object r7 = r7.mo56107c()
            java.lang.String r7 = (java.lang.String) r7
            r11.copyOnWrite()
            com.google.protobuf.bv r8 = r11.instance
            com.google.assistant.s.a.bp r8 = (com.google.assistant.p3994s.p3995a.C53106bp) r8
            r7.getClass()
            int r9 = r8.f139167a
            r9 = r9 | 8
            r8.f139167a = r9
            r8.f139170d = r7
        L_0x01e4:
            com.google.assistant.s.a.jd r7 = com.google.assistant.p3994s.p3995a.C53310jd.f139802c
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.s.a.jc r7 = (com.google.assistant.p3994s.p3995a.C53309jc) r7
            com.google.assistant.s.a.bq r8 = com.google.assistant.p3994s.p3995a.C53107bq.f139172c
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.s.a.bh r8 = (com.google.assistant.p3994s.p3995a.C53098bh) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.s.a.bq r9 = (com.google.assistant.p3994s.p3995a.C53107bq) r9
            com.google.protobuf.bv r10 = r11.build()
            com.google.assistant.s.a.bp r10 = (com.google.assistant.p3994s.p3995a.C53106bp) r10
            r10.getClass()
            r9.f139175b = r10
            r9.f139174a = r4
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.assistant.s.a.jd r9 = (com.google.assistant.p3994s.p3995a.C53310jd) r9
            com.google.protobuf.bv r8 = r8.build()
            com.google.assistant.s.a.bq r8 = (com.google.assistant.p3994s.p3995a.C53107bq) r8
            r8.getClass()
            r9.f139805b = r8
            r8 = 11
            r9.f139804a = r8
            com.google.protobuf.bv r7 = r7.build()
            com.google.assistant.s.a.jd r7 = (com.google.assistant.p3994s.p3995a.C53310jd) r7
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            java.lang.String r9 = "zero_state_action_name"
            java.lang.String r10 = "AsyncUpdateAction"
            r8.putExtra(r9, r10)
            com.google.common.l.i r9 = com.google.common.p4541l.C59326i.f157517e
            byte[] r7 = r7.toByteArray()
            int r10 = r7.length
            java.lang.String r7 = r9.mo56837l(r7, r10)
            java.lang.String r9 = "async_update_data"
            r8.putExtra(r9, r7)
            com.google.common.base.ax r7 = com.google.common.base.C58833ax.m90834k(r8)
        L_0x0244:
            boolean r8 = r7.mo56113h()
            r9 = 0
            if (r8 == 0) goto L_0x0267
            java.lang.Object r7 = r7.mo56107c()
            android.content.Intent r7 = (android.content.Intent) r7
            java.lang.String r7 = r7.toUri(r9)
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.assistant.s.a.ih r8 = (com.google.assistant.p3994s.p3995a.C53287ih) r8
            r7.getClass()
            int r10 = r8.f139695a
            r10 = r10 | 1024(0x400, float:1.435E-42)
            r8.f139695a = r10
            r8.f139705k = r7
        L_0x0267:
            java.lang.Object[] r7 = new java.lang.Object[r4]
            com.google.common.l.i r8 = com.google.common.p4541l.C59326i.f157517e
            com.google.common.l.i r8 = r8.mo56826f()
            com.google.protobuf.bv r10 = r0.build()
            com.google.assistant.s.a.ih r10 = (com.google.assistant.p3994s.p3995a.C53287ih) r10
            byte[] r10 = r10.toByteArray()
            int r11 = r10.length
            java.lang.String r8 = r8.mo56837l(r10, r11)
            r7[r9] = r8
            java.lang.String r8 = "googleassistant://zerostate?data=%s"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            com.google.assistant.e.j.ada r8 = com.google.assistant.p3897e.p3921j.ada.f134865f
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.j.acz r8 = (com.google.assistant.p3897e.p3921j.acz) r8
            com.google.assistant.e.c.c.gh r9 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.e.c.c.gg r9 = (com.google.assistant.p3897e.p3902c.p3907c.C51097gg) r9
            com.google.assistant.e.c.c.ev r10 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.e.c.c.es r10 = (com.google.assistant.p3897e.p3902c.p3907c.C51055es) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.assistant.e.c.c.ev r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r11
            int r0 = r11.f132943a
            r0 = r0 | r4
            r11.f132943a = r0
            java.lang.String r0 = "com.google.android.googlequicksearchbox"
            r11.f132944b = r0
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.assistant.e.c.c.ev r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r11
            r7.getClass()
            int r0 = r11.f132943a
            r0 = r0 | 32
            r11.f132943a = r0
            r11.f132949g = r7
            r9.copyOnWrite()
            com.google.protobuf.bv r7 = r9.instance
            com.google.assistant.e.c.c.gh r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r7
            com.google.protobuf.bv r10 = r10.build()
            com.google.assistant.e.c.c.ev r10 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r10
            r10.getClass()
            r7.f133013c = r10
            r7.f133012b = r4
            r8.copyOnWrite()
            com.google.protobuf.bv r7 = r8.instance
            com.google.assistant.e.j.ada r7 = (com.google.assistant.p3897e.p3921j.ada) r7
            com.google.protobuf.bv r9 = r9.build()
            com.google.assistant.e.c.c.gh r9 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r9
            r9.getClass()
            r7.f134868b = r9
            int r9 = r7.f134867a
            r9 = r9 | r4
            r7.f134867a = r9
            com.google.protobuf.bv r7 = r8.build()
            com.google.assistant.e.j.ada r7 = (com.google.assistant.p3897e.p3921j.ada) r7
            java.lang.String r8 = "provider.OPEN"
            java.lang.String r9 = "open_provider_args"
            java.lang.String r10 = "assistant.api.client_op.OpenProviderArgs"
            com.google.assistant.e.j.dy r7 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26575e(r8, r9, r10, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11110bs.m26371d(com.google.assistant.e.j.pj, java.lang.String, com.google.common.base.ax, com.google.common.base.ax, com.google.common.base.ax):com.google.assistant.e.j.dy");
    }

    /* renamed from: e */
    public static C51809dy m26372e(C52374pj pjVar, String str, String str2, C58833ax axVar) {
        C52308my myVar = (C52308my) C52321nk.f137326j.createBuilder();
        myVar.copyOnWrite();
        pjVar.getClass();
        ((C52321nk) myVar.instance).f137331d = pjVar;
        C52311na naVar = (C52311na) C52312nb.f137312c.createBuilder();
        naVar.mo53829b(str);
        naVar.copyOnWrite();
        str2.getClass();
        ((C52312nb) naVar.instance).f137315b = str2;
        myVar.copyOnWrite();
        C52321nk nkVar = (C52321nk) myVar.instance;
        C52312nb nbVar = (C52312nb) naVar.build();
        nbVar.getClass();
        nkVar.f137329b = nbVar;
        nkVar.f137328a = 13;
        if (axVar.mo56113h()) {
            C51098gh ghVar = (C51098gh) axVar.mo56107c();
            myVar.copyOnWrite();
            ghVar.getClass();
            ((C52321nk) myVar.instance).f137333f = ghVar;
        }
        return C11209d.m26579i((C52321nk) myVar.build());
    }

    /* renamed from: f */
    public static C51809dy m26373f(C52374pj pjVar, String str, String str2, C58833ax axVar, boolean z) {
        C51058ev evVar;
        C52308my myVar = (C52308my) C52321nk.f137326j.createBuilder();
        myVar.copyOnWrite();
        pjVar.getClass();
        ((C52321nk) myVar.instance).f137331d = pjVar;
        myVar.copyOnWrite();
        str2.getClass();
        ((C52321nk) myVar.instance).f137334g = str2;
        if (!TextUtils.isEmpty(str)) {
            myVar.copyOnWrite();
            str.getClass();
            ((C52321nk) myVar.instance).f137332e = str;
        }
        if (axVar.mo56113h()) {
            C51098gh ghVar = (C51098gh) axVar.mo56107c();
            if (ghVar.f133012b == 1) {
                evVar = (C51058ev) ghVar.f133013c;
            } else {
                evVar = C51058ev.f132941o;
            }
            C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder(evVar);
            if (((C51058ev) esVar.instance).f132944b.equals("SMS") && z) {
                esVar.copyOnWrite();
                C51058ev evVar2 = (C51058ev) esVar.instance;
                evVar2.f132943a |= 1;
                evVar2.f132944b = "com.google.android.apps.messaging";
            }
            C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
            ggVar.copyOnWrite();
            C51098gh ghVar2 = (C51098gh) ggVar.instance;
            C51058ev evVar3 = (C51058ev) esVar.build();
            evVar3.getClass();
            ghVar2.f133013c = evVar3;
            ghVar2.f133012b = 1;
            C51098gh ghVar3 = (C51098gh) ggVar.build();
            myVar.copyOnWrite();
            ghVar3.getClass();
            ((C52321nk) myVar.instance).f137333f = ghVar3;
        }
        if (z) {
            myVar.copyOnWrite();
            ((C52321nk) myVar.instance).f137335h = true;
            myVar.copyOnWrite();
            ((C52321nk) myVar.instance).f137336i = 1;
        }
        return C11209d.m26579i((C52321nk) myVar.build());
    }

    /* JADX WARNING: type inference failed for: r2v12, types: [com.google.protobuf.bn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.assistant.p3897e.p3921j.C51809dy m26374g(com.google.assistant.p3897e.p3917i.p3918a.C51406gn r2, com.google.assistant.p3897e.p3921j.C52374pj r3, com.google.common.base.C58833ax r4) {
        /*
            com.google.assistant.e.j.nk r0 = com.google.assistant.p3897e.p3921j.C52321nk.f137326j
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.my r0 = (com.google.assistant.p3897e.p3921j.C52308my) r0
            com.google.common.base.ax r2 = m26377j(r2)
            boolean r1 = r2.mo56113h()
            if (r1 == 0) goto L_0x001f
            java.lang.Object r2 = r2.mo56107c()
            com.google.assistant.e.j.nk r2 = (com.google.assistant.p3897e.p3921j.C52321nk) r2
            com.google.protobuf.bn r2 = r2.toBuilder()
            r0 = r2
            com.google.assistant.e.j.my r0 = (com.google.assistant.p3897e.p3921j.C52308my) r0
        L_0x001f:
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.nk r2 = (com.google.assistant.p3897e.p3921j.C52321nk) r2
            r3.getClass()
            r2.f137331d = r3
            boolean r2 = r4.mo56113h()
            if (r2 == 0) goto L_0x0043
            java.lang.Object r2 = r4.mo56107c()
            com.google.assistant.e.c.c.gh r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r2
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.e.j.nk r3 = (com.google.assistant.p3897e.p3921j.C52321nk) r3
            r2.getClass()
            r3.f137333f = r2
        L_0x0043:
            com.google.protobuf.bv r2 = r0.build()
            com.google.assistant.e.j.nk r2 = (com.google.assistant.p3897e.p3921j.C52321nk) r2
            com.google.assistant.e.j.dy r2 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26579i(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11110bs.m26374g(com.google.assistant.e.i.a.gn, com.google.assistant.e.j.pj, com.google.common.base.ax):com.google.assistant.e.j.dy");
    }

    /* JADX WARNING: type inference failed for: r11v23, types: [com.google.protobuf.bn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.assistant.p3897e.p3921j.p3926e.C51941eu m26375h(android.content.Context r7, com.google.assistant.p3897e.p3921j.p3926e.C51941eu r8, com.google.common.base.C58833ax r9, com.google.common.base.C58833ax r10, com.google.common.base.C58833ax r11, com.google.common.base.C58833ax r12) {
        /*
            int r0 = r8.f136277e
            r1 = 4
            if (r0 != r1) goto L_0x000a
            java.lang.Object r0 = r8.f136278f
            com.google.assistant.e.c.c.co r0 = (com.google.assistant.p3897e.p3902c.p3907c.C50997co) r0
            goto L_0x000c
        L_0x000a:
            com.google.assistant.e.c.c.co r0 = com.google.assistant.p3897e.p3902c.p3907c.C50997co.f132759h
        L_0x000c:
            com.google.assistant.e.c.c.hx r0 = r0.f132767g
            if (r0 != 0) goto L_0x0012
            com.google.assistant.e.c.c.hx r0 = com.google.assistant.p3897e.p3902c.p3907c.C51141hx.f133119h
        L_0x0012:
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.assistant.e.c.c.hu r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51138hu) r0
            boolean r2 = r9.mo56113h()
            r3 = 1
            if (r2 == 0) goto L_0x0083
            android.content.res.Resources r2 = r7.getResources()
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            java.lang.Object r6 = r9.mo56107c()
            r4[r5] = r6
            boolean r5 = r10.mo56113h()
            if (r5 == 0) goto L_0x0061
            java.lang.Object r5 = r10.mo56107c()
            com.google.assistant.e.c.c.gh r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r5
            int r6 = r5.f133012b
            if (r6 != r3) goto L_0x0042
            java.lang.Object r5 = r5.f133013c
            com.google.assistant.e.c.c.ev r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r5
            goto L_0x0044
        L_0x0042:
            com.google.assistant.e.c.c.ev r5 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x0044:
            int r5 = r5.f132943a
            r5 = r5 & r3
            if (r5 == 0) goto L_0x0061
            java.lang.Object r5 = r10.mo56107c()
            com.google.assistant.e.c.c.gh r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r5
            int r6 = r5.f133012b
            if (r6 != r3) goto L_0x0058
            java.lang.Object r5 = r5.f133013c
            com.google.assistant.e.c.c.ev r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r5
            goto L_0x005a
        L_0x0058:
            com.google.assistant.e.c.c.ev r5 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x005a:
            java.lang.String r5 = r5.f132944b
            java.lang.String r5 = m26381n(r7, r5)
            goto L_0x006c
        L_0x0061:
            android.content.res.Resources r5 = r7.getResources()
            r6 = 2132085235(0x7f1509f3, float:1.9810663E38)
            java.lang.String r5 = r5.getString(r6)
        L_0x006c:
            r4[r3] = r5
            r5 = 2132085212(0x7f1509dc, float:1.9810616E38)
            java.lang.String r2 = r2.getString(r5, r4)
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.e.c.c.hx r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r4
            r2.getClass()
            r4.f133122b = r3
            r4.f133123c = r2
        L_0x0083:
            boolean r2 = r9.mo56113h()
            if (r2 == 0) goto L_0x00c6
            com.google.assistant.e.c.c.dc r2 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.c.c.db r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51011db) r2
            boolean r4 = r11.mo56113h()
            if (r4 == 0) goto L_0x00a4
            java.lang.Object r11 = r11.mo56107c()
            com.google.assistant.e.c.c.dc r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r11
            com.google.protobuf.bn r11 = r11.toBuilder()
            r2 = r11
            com.google.assistant.e.c.c.db r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51011db) r2
        L_0x00a4:
            java.lang.Object r9 = r9.mo56107c()
            java.lang.String r9 = (java.lang.String) r9
            r2.copyOnWrite()
            com.google.protobuf.bv r11 = r2.instance
            com.google.assistant.e.c.c.dc r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r11
            r9.getClass()
            int r4 = r11.f132815a
            r4 = r4 | 2048(0x800, float:2.87E-42)
            r11.f132815a = r4
            r11.f132824j = r9
            com.google.protobuf.bv r9 = r2.build()
            com.google.assistant.e.c.c.dc r9 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r9
            com.google.common.base.ax r11 = com.google.common.base.C58833ax.m90834k(r9)
        L_0x00c6:
            boolean r9 = r11.mo56113h()
            if (r9 == 0) goto L_0x013b
            java.lang.Object r9 = r11.mo56107c()
            com.google.assistant.e.c.c.dc r9 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r9
            com.google.protobuf.bn r9 = r9.toBuilder()
            com.google.assistant.e.c.c.db r9 = (com.google.assistant.p3897e.p3902c.p3907c.C51011db) r9
            boolean r11 = r10.mo56113h()
            if (r11 == 0) goto L_0x0123
            com.google.assistant.e.c.c.dc r11 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.e.c.c.db r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51011db) r11
            java.lang.Object r2 = r10.mo56107c()
            com.google.assistant.e.c.c.gh r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r2
            int r4 = r2.f133012b
            if (r4 != r3) goto L_0x00f5
            java.lang.Object r2 = r2.f133013c
            com.google.assistant.e.c.c.ev r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r2
            goto L_0x00f7
        L_0x00f5:
            com.google.assistant.e.c.c.ev r2 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x00f7:
            java.lang.String r2 = r2.f132944b
            r11.copyOnWrite()
            com.google.protobuf.bv r3 = r11.instance
            com.google.assistant.e.c.c.dc r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r3
            r2.getClass()
            int r4 = r3.f132815a
            r4 = r4 | 32
            r3.f132815a = r4
            r3.f132821g = r2
            r9.copyOnWrite()
            com.google.protobuf.bv r2 = r9.instance
            com.google.assistant.e.c.c.dc r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r2
            com.google.protobuf.bv r11 = r11.build()
            com.google.assistant.e.c.c.dc r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r11
            r11.getClass()
            r2.f132823i = r11
            int r11 = r2.f132815a
            r11 = r11 | 1024(0x400, float:1.435E-42)
            r2.f132815a = r11
        L_0x0123:
            r0.copyOnWrite()
            com.google.protobuf.bv r11 = r0.instance
            com.google.assistant.e.c.c.hx r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r11
            com.google.protobuf.bv r9 = r9.build()
            com.google.assistant.e.c.c.dc r9 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r9
            r9.getClass()
            r11.f133126f = r9
            int r9 = r11.f133121a
            r9 = r9 | 16
            r11.f133121a = r9
        L_0x013b:
            com.google.protobuf.bn r9 = r8.toBuilder()
            com.google.assistant.e.j.e.eq r9 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r9
            int r11 = r8.f136277e
            if (r11 != r1) goto L_0x014a
            java.lang.Object r8 = r8.f136278f
            com.google.assistant.e.c.c.co r8 = (com.google.assistant.p3897e.p3902c.p3907c.C50997co) r8
            goto L_0x014c
        L_0x014a:
            com.google.assistant.e.c.c.co r8 = com.google.assistant.p3897e.p3902c.p3907c.C50997co.f132759h
        L_0x014c:
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.assistant.e.c.c.cl r8 = (com.google.assistant.p3897e.p3902c.p3907c.C50994cl) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.assistant.e.c.c.co r11 = (com.google.assistant.p3897e.p3902c.p3907c.C50997co) r11
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.c.c.hx r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r0
            r0.getClass()
            r11.f132767g = r0
            int r0 = r11.f132761a
            r0 = r0 | 128(0x80, float:1.794E-43)
            r11.f132761a = r0
            r9.copyOnWrite()
            com.google.protobuf.bv r11 = r9.instance
            com.google.assistant.e.j.e.eu r11 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r11
            com.google.protobuf.bv r8 = r8.build()
            com.google.assistant.e.c.c.co r8 = (com.google.assistant.p3897e.p3902c.p3907c.C50997co) r8
            r8.getClass()
            r11.f136278f = r8
            r11.f136277e = r1
            boolean r8 = r10.mo56113h()
            r11 = 22
            if (r8 == 0) goto L_0x019f
            java.lang.Object r7 = r10.mo56107c()
            com.google.assistant.e.c.c.gh r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r7
            com.google.assistant.e.c.c.gh r7 = m26368a(r7, r12)
            r9.copyOnWrite()
            com.google.protobuf.bv r8 = r9.instance
            com.google.assistant.e.j.e.eu r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r8
            r7.getClass()
            r8.f136276d = r7
            r8.f136275c = r11
            goto L_0x01b1
        L_0x019f:
            com.google.assistant.e.c.c.gh r7 = m26369b(r7)
            r9.copyOnWrite()
            com.google.protobuf.bv r8 = r9.instance
            com.google.assistant.e.j.e.eu r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r8
            r7.getClass()
            r8.f136276d = r7
            r8.f136275c = r11
        L_0x01b1:
            com.google.protobuf.bv r7 = r9.build()
            com.google.assistant.e.j.e.eu r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11110bs.m26375h(android.content.Context, com.google.assistant.e.j.e.eu, com.google.common.base.ax, com.google.common.base.ax, com.google.common.base.ax, com.google.common.base.ax):com.google.assistant.e.j.e.eu");
    }

    /* renamed from: i */
    public static C58833ax m26376i(C51406gn gnVar) {
        Object obj;
        try {
            C51406gn gnVar2 = (C51406gn) C62942bv.parseFrom((C62942bv) C51406gn.f133887s, gnVar.toByteArray(), C62921ba.m95368a());
            C62940bt r0 = C62942bv.checkIsLite(C51458il.f134043i);
            gnVar2.mo58887l(r0);
            if (gnVar2.f169962ag.mo58857o(r0.f169971d)) {
                C62940bt r02 = C62942bv.checkIsLite(C51458il.f134043i);
                gnVar2.mo58887l(r02);
                Object l = gnVar2.f169962ag.mo58854l(r02.f169971d);
                if (l == null) {
                    obj = r02.f169969b;
                } else {
                    obj = r02.mo58889c(l);
                }
                return C58833ax.m90834k((C51458il) obj);
            }
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f36417c.mo56225c()).mo56382g(e)).mo56372aa(43018)).mo56386p("Incompatible CommunicationFluidActionsData proto implementations");
        }
        return C58836b.f156633a;
    }

    /* renamed from: j */
    public static C58833ax m26377j(C51406gn gnVar) {
        C58833ax i = m26376i(gnVar);
        if (i.mo56113h() && (((C51458il) i.mo56107c()).f134045a & 16) != 0) {
            C51466it itVar = ((C51458il) i.mo56107c()).f134050f;
            if (itVar == null) {
                itVar = C51466it.f134076d;
            }
            if ((itVar.f134078a & 1) != 0) {
                C52321nk nkVar = itVar.f134079b;
                if (nkVar == null) {
                    nkVar = C52321nk.f137326j;
                }
                return C58833ax.m90834k(nkVar);
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: k */
    public static C58833ax m26378k(C52070ec ecVar) {
        C52069eb ebVar = ecVar.f136655c;
        if (ebVar == null) {
            ebVar = C52069eb.f136648b;
        }
        for (C52232kc kcVar : ebVar.f136650a) {
            if (kcVar.f137065b.equals("download_photos_result")) {
                C52230ka kaVar = kcVar.f137066c;
                if (kaVar == null) {
                    kaVar = C52230ka.f137057d;
                }
                if (kaVar.f137060b.equals("assistant.api.client_op.DownloadPhotosResult")) {
                    try {
                        C52230ka kaVar2 = kcVar.f137066c;
                        if (kaVar2 == null) {
                            kaVar2 = C52230ka.f137057d;
                        }
                        return C58833ax.m90834k(((C52217jo) C62942bv.parseFrom((C62942bv) C52217jo.f137027b, kaVar2.f137061c, C62921ba.m95368a())).f137029a);
                    } catch (C62974ct unused) {
                        ((C59052c) ((C59052c) f36417c.mo56225c()).mo56372aa(43019)).mo56386p("Incompatible person proto implementations.");
                        return C58836b.f156633a;
                    }
                }
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: l */
    public static C58833ax m26379l(C51406gn gnVar) {
        C58833ax i = m26376i(gnVar);
        if (!i.mo56113h()) {
            return C58836b.f156633a;
        }
        C51466it itVar = ((C51458il) i.mo56107c()).f134050f;
        if (itVar == null) {
            itVar = C51466it.f134076d;
        }
        C51465is a = C51465is.m86194a(itVar.f134080c);
        if (a == null) {
            a = C51465is.UNKNOWN;
        }
        return C58833ax.m90834k(a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0067  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.p4522b.C58485gu m26380m(com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n r4, com.google.assistant.p3897e.p3921j.C52374pj r5, java.lang.String r6, java.lang.String r7, com.google.common.base.C58833ax r8, boolean r9) {
        /*
            com.google.protobuf.bn r4 = r4.toBuilder()
            com.google.protos.f.b.b.a.e r4 = (com.google.protos.p4985f.p4988b.p4990b.p4991a.C64726e) r4
            boolean r0 = r8.mo56113h()
            r1 = 1
            if (r0 == 0) goto L_0x0041
            java.lang.Object r0 = r8.mo56107c()
            com.google.assistant.e.c.c.gh r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r0
            int r2 = r0.f133012b
            if (r2 != r1) goto L_0x001c
            java.lang.Object r0 = r0.f133013c
            com.google.assistant.e.c.c.ev r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r0
            goto L_0x001e
        L_0x001c:
            com.google.assistant.e.c.c.ev r0 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x001e:
            java.lang.String r0 = r0.f132944b
            java.lang.String r2 = "com.whatsapp"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0041
            com.google.protos.f.b.b.a.i r0 = com.google.protos.p4985f.p4988b.p4990b.p4991a.C64730i.BRING_KEYBOARD_UP_IF_FIELD_IS_FOCUSED
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.protos.f.b.b.a.n r3 = (com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n) r3
            int r0 = r0.getNumber()
            r3.f175469a = r0
            r4.copyOnWrite()
            com.google.protobuf.bv r0 = r4.instance
            com.google.protos.f.b.b.a.n r0 = (com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n) r0
            r0.f175474f = r2
            goto L_0x0050
        L_0x0041:
            com.google.protos.f.b.b.a.i r0 = com.google.protos.p4985f.p4988b.p4990b.p4991a.C64730i.WAIT_FOR_KEYBOARD_UP
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.protos.f.b.b.a.n r2 = (com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n) r2
            int r0 = r0.getNumber()
            r2.f175469a = r0
        L_0x0050:
            com.google.protobuf.bv r4 = r4.build()
            com.google.protos.f.b.b.a.n r4 = (com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n) r4
            if (r9 == 0) goto L_0x0067
            com.google.assistant.e.j.dy r5 = m26373f(r5, r6, r7, r8, r1)
            com.google.assistant.e.j.dy r6 = f36415a
            com.google.assistant.e.j.dy r4 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26583m(r4)
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89848p(r5, r6, r4)
            return r4
        L_0x0067:
            com.google.assistant.e.j.dy r4 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26583m(r4)
            com.google.assistant.e.j.dy r5 = m26373f(r5, r6, r7, r8, r1)
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89847o(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11110bs.m26380m(com.google.protos.f.b.b.a.n, com.google.assistant.e.j.pj, java.lang.String, java.lang.String, com.google.common.base.ax, boolean):com.google.common.b.gu");
    }

    /* renamed from: n */
    public static String m26381n(Context context, String str) {
        CharSequence applicationLabel;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
            if (!(applicationInfo == null || (applicationLabel = context.getPackageManager().getApplicationLabel(applicationInfo)) == null)) {
                return applicationLabel.toString();
            }
        } catch (PackageManager.NameNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f36417c.mo56226d()).mo56382g(e)).mo56372aa(43022)).mo56389s("Package not found: %s", str);
        }
        return context.getResources().getString(R.string.assistantactions_sms_provider_name);
    }

    /* renamed from: o */
    public static String m26382o(Context context) {
        return Telephony.Sms.getDefaultSmsPackage(context);
    }

    /* renamed from: p */
    public static List m26383p(C52623yp ypVar) {
        ArrayList arrayList = new ArrayList();
        C52627yt ytVar = ypVar.f138165b;
        if (ytVar == null) {
            ytVar = C52627yt.f138176c;
        }
        for (C52617yj yjVar : ytVar.f138179b) {
            arrayList.addAll(yjVar.f138148a);
        }
        return arrayList;
    }

    /* renamed from: q */
    public static boolean m26384q(C51406gn gnVar) {
        C58833ax l = m26379l(gnVar);
        if (!l.mo56113h()) {
            return false;
        }
        C51465is isVar = C51465is.UNKNOWN;
        C51401gi giVar = C51401gi.CONTROLLER_STATE_UNKNOWN;
        switch (((C51465is) l.mo56107c()).ordinal()) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: r */
    public static boolean m26385r(C51401gi giVar) {
        C51465is isVar = C51465is.UNKNOWN;
        C51401gi giVar2 = C51401gi.CONTROLLER_STATE_UNKNOWN;
        int ordinal = giVar.ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 5 || ordinal == 6 || ordinal == 11 || ordinal == 16 || ordinal == 17;
    }

    /* renamed from: s */
    public static boolean m26386s(C51401gi giVar) {
        C51465is isVar = C51465is.UNKNOWN;
        C51401gi giVar2 = C51401gi.CONTROLLER_STATE_UNKNOWN;
        int ordinal = giVar.ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 5 || ordinal == 6 || ordinal == 11 || ordinal == 17;
    }

    /* renamed from: t */
    public static boolean m26387t(C51401gi giVar) {
        C51465is isVar = C51465is.UNKNOWN;
        C51401gi giVar2 = C51401gi.CONTROLLER_STATE_UNKNOWN;
        int ordinal = giVar.ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 5 || ordinal == 6 || ordinal == 16 || ordinal == 17;
    }

    /* renamed from: u */
    public static boolean m26388u(C51401gi giVar) {
        C51465is isVar = C51465is.UNKNOWN;
        C51401gi giVar2 = C51401gi.CONTROLLER_STATE_UNKNOWN;
        int ordinal = giVar.ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 5 || ordinal == 6 || ordinal == 9 || ordinal == 16 || ordinal == 17;
    }

    /* renamed from: v */
    public static boolean m26389v(C51401gi giVar) {
        C51465is isVar = C51465is.UNKNOWN;
        C51401gi giVar2 = C51401gi.CONTROLLER_STATE_UNKNOWN;
        int ordinal = giVar.ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 5 || ordinal == 6 || ordinal == 9 || ordinal == 17;
    }

    /* renamed from: w */
    public static boolean m26390w(C51401gi giVar) {
        C51465is isVar = C51465is.UNKNOWN;
        C51401gi giVar2 = C51401gi.CONTROLLER_STATE_UNKNOWN;
        int ordinal = giVar.ordinal();
        return ordinal == 9 || ordinal == 10 || ordinal == 16 || ordinal == 17;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m26391x(com.google.assistant.p3897e.p3917i.p3918a.C51406gn r6) {
        /*
            com.google.assistant.e.j.pn r0 = r6.f133895g
            if (r0 != 0) goto L_0x0006
            com.google.assistant.e.j.pn r0 = com.google.assistant.p3897e.p3921j.C52378pn.f137444j
        L_0x0006:
            com.google.assistant.e.j.pj r0 = r0.f137453h
            if (r0 != 0) goto L_0x000c
            com.google.assistant.e.j.pj r0 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x000c:
            int r1 = r0.f137437b
            java.lang.String r2 = ""
            r3 = 2
            if (r1 != r3) goto L_0x0018
            java.lang.Object r1 = r0.f137438c
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0019
        L_0x0018:
            r1 = r2
        L_0x0019:
            boolean r1 = r1.isEmpty()
            r4 = 6
            r5 = 1
            if (r1 == 0) goto L_0x0042
            int r1 = r0.f137437b
            if (r1 != r4) goto L_0x002a
            java.lang.Object r0 = r0.f137438c
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L_0x002a:
            java.lang.String r0 = "@s.whatsapp.net"
            boolean r0 = r2.endsWith(r0)
            if (r0 == 0) goto L_0x0033
            goto L_0x0042
        L_0x0033:
            com.google.common.f.e r6 = f36417c
            com.google.common.f.x r6 = r6.mo56224b()
            java.lang.String r0 = "Messaging App not supported in OnMyWayHome flow"
            r1 = 43023(0xa80f, float:6.0288E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r1)).mo56386p(r0)
            return r5
        L_0x0042:
            com.google.assistant.e.i.a.is r0 = com.google.assistant.p3897e.p3917i.p3918a.C51465is.UNKNOWN
            com.google.assistant.e.i.a.gi r0 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.CONTROLLER_STATE_UNKNOWN
            int r6 = r6.f133894f
            com.google.assistant.e.i.a.gi r6 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.m86175a(r6)
            if (r6 != 0) goto L_0x0050
            com.google.assistant.e.i.a.gi r6 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.CONTROLLER_STATE_UNKNOWN
        L_0x0050:
            int r6 = r6.ordinal()
            if (r6 == r5) goto L_0x006e
            if (r6 == r3) goto L_0x006e
            r0 = 3
            if (r6 == r0) goto L_0x006e
            r0 = 5
            if (r6 == r0) goto L_0x006e
            if (r6 == r4) goto L_0x006e
            r0 = 11
            if (r6 == r0) goto L_0x006e
            r0 = 16
            if (r6 == r0) goto L_0x006e
            r0 = 17
            if (r6 == r0) goto L_0x006e
            r6 = 0
            return r6
        L_0x006e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a.C11110bs.m26391x(com.google.assistant.e.i.a.gn):boolean");
    }

    /* renamed from: y */
    public static boolean m26392y(C51401gi giVar, C58833ax axVar, C11054a aVar) {
        C51058ev evVar;
        if (axVar.mo56113h()) {
            C51098gh ghVar = (C51098gh) axVar.mo56107c();
            if (ghVar.f133012b == 1) {
                evVar = (C51058ev) ghVar.f133013c;
            } else {
                evVar = C51058ev.f132941o;
            }
            String str = evVar.f132944b;
            Map map = (Map) aVar.f36299b.get(14);
            if (map == null) {
                map = new HashMap();
            }
            if (!str.isEmpty() && !map.containsKey(str)) {
                return true;
            }
        }
        C51465is isVar = C51465is.UNKNOWN;
        C51401gi giVar2 = C51401gi.CONTROLLER_STATE_UNKNOWN;
        int ordinal = giVar.ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 5 || ordinal == 6 || ordinal == 8 || ordinal == 11 || ordinal == 16 || ordinal == 17) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public static boolean m26393z(C51401gi giVar) {
        C51465is isVar = C51465is.UNKNOWN;
        C51401gi giVar2 = C51401gi.CONTROLLER_STATE_UNKNOWN;
        int ordinal = giVar.ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 5 || ordinal == 6 || ordinal == 11 || ordinal == 16 || ordinal == 17;
    }
}
