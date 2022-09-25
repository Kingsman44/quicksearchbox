package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x;
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
import com.google.assistant.p3897e.p3921j.C52617yj;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.assistant.p3897e.p3921j.C52627yt;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.bv */
/* compiled from: PG */
public final class C33027bv {

    /* renamed from: a */
    static final C51809dy f88443a;

    /* renamed from: b */
    public static final /* synthetic */ int f88444b = 0;

    /* renamed from: c */
    private static final C59071e f88445c = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.bv");

    static {
        C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
        dxVar.copyOnWrite();
        C51809dy dyVar = (C51809dy) dxVar.instance;
        dyVar.f135935a |= 1;
        dyVar.f135936b = "core.DISMISS_ASSISTANT";
        f88443a = (C51809dy) dxVar.build();
    }

    /* renamed from: a */
    public static C51098gh m61270a(Context context) {
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

    /* renamed from: b */
    public static C51809dy m61271b(List list) {
        C52214jl jlVar = (C52214jl) C52215jm.f137024b.createBuilder();
        jlVar.mo53817a(list);
        return C33116d.m61446e("photos.DOWNLOAD_PHOTOS", (C52215jm) jlVar.build(), "download_photos_args", "assistant.api.proto.AssistantPhotosClientOp.DownloadPhotosArgs");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v68, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v75, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.assistant.p3897e.p3921j.C51809dy m61272c(com.google.assistant.p3897e.p3921j.C52374pj r7, java.lang.String r8, p3186j$.util.Optional r9, p3186j$.util.Optional r10, p3186j$.util.Optional r11) {
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
            j$.util.Optional r7 = p3186j$.util.Optional.m71637of(r7)
            goto L_0x0113
        L_0x0099:
            int r1 = r7.f137437b
            r6 = 6
            if (r1 != r6) goto L_0x00a3
            java.lang.Object r7 = r7.f137438c
            r3 = r7
            java.lang.String r3 = (java.lang.String) r3
        L_0x00a3:
            boolean r7 = r3.isEmpty()
            if (r7 == 0) goto L_0x00ae
            j$.util.Optional r7 = p3186j$.util.Optional.empty()
            goto L_0x0113
        L_0x00ae:
            boolean r7 = r11.isPresent()
            if (r7 == 0) goto L_0x010f
            java.lang.Object r7 = r11.get()
            com.google.assistant.e.c.c.gh r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r7
            int r11 = r7.f133012b
            if (r11 != r4) goto L_0x00c3
            java.lang.Object r7 = r7.f133013c
            com.google.assistant.e.c.c.ev r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r7
            goto L_0x00c5
        L_0x00c3:
            com.google.assistant.e.c.c.ev r7 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x00c5:
            java.lang.String r7 = r7.f132944b
            java.lang.String r11 = "com.whatsapp"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x010f
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
            j$.util.Optional r7 = p3186j$.util.Optional.m71637of(r7)
            goto L_0x0113
        L_0x010f:
            j$.util.Optional r7 = p3186j$.util.Optional.empty()
        L_0x0113:
            boolean r11 = r7.isPresent()
            if (r11 != 0) goto L_0x011f
            j$.util.Optional r7 = p3186j$.util.Optional.empty()
            goto L_0x024e
        L_0x011f:
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
            java.lang.Object r7 = r7.get()
            com.google.assistant.s.a.bo r7 = (com.google.assistant.p3994s.p3995a.C53105bo) r7
            r11.copyOnWrite()
            com.google.protobuf.bv r8 = r11.instance
            com.google.assistant.s.a.bp r8 = (com.google.assistant.p3994s.p3995a.C53106bp) r8
            r7.getClass()
            r8.f139171e = r7
            int r7 = r8.f139167a
            r7 = r7 | 16
            r8.f139167a = r7
            boolean r7 = r9.isPresent()
            if (r7 == 0) goto L_0x017a
            java.lang.Object r7 = r9.get()
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x017a
            java.lang.Object r7 = r9.get()
            java.lang.String r7 = (java.lang.String) r7
            r11.copyOnWrite()
            com.google.protobuf.bv r8 = r11.instance
            com.google.assistant.s.a.bp r8 = (com.google.assistant.p3994s.p3995a.C53106bp) r8
            r7.getClass()
            int r9 = r8.f139167a
            r9 = r9 | 4
            r8.f139167a = r9
            r8.f139169c = r7
        L_0x017a:
            boolean r7 = r10.isPresent()
            if (r7 == 0) goto L_0x01ee
            java.lang.Object r7 = r10.get()
            com.google.assistant.e.c.c.dc r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r7
            java.lang.String r8 = r7.f132817c
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x0193
            j$.util.Optional r7 = p3186j$.util.Optional.empty()
            goto L_0x01d0
        L_0x0193:
            com.google.assistant.e.i.a.is r8 = com.google.assistant.p3897e.p3917i.p3918a.C51465is.UNKNOWN
            com.google.assistant.e.i.a.gi r8 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.CONTROLLER_STATE_UNKNOWN
            int r8 = r7.f132816b
            int r8 = com.google.assistant.p3897e.p3902c.p3907c.C51014de.m86008a(r8)
            if (r8 != 0) goto L_0x01a0
            r8 = 1
        L_0x01a0:
            int r8 = r8 + -1
            if (r8 == 0) goto L_0x01ca
            if (r8 == r2) goto L_0x01b9
            com.google.common.f.e r7 = f88445c
            com.google.common.f.x r7 = r7.mo56226d()
            java.lang.String r8 = "Contact image type not recognized, returning empty image."
            r9 = 50848(0xc6a0, float:7.1253E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r9)).mo56386p(r8)
            j$.util.Optional r7 = p3186j$.util.Optional.empty()
            goto L_0x01d0
        L_0x01b9:
            java.lang.String r7 = r7.f132817c
            java.lang.Long r7 = com.google.common.p4575r.C60761r.m92762h(r7)
            j$.util.Optional r7 = p3186j$.util.Optional.ofNullable(r7)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.bu r8 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33026bu.f88442a
            j$.util.Optional r7 = r7.map(r8)
            goto L_0x01d0
        L_0x01ca:
            java.lang.String r7 = r7.f132817c
            j$.util.Optional r7 = p3186j$.util.Optional.m71637of(r7)
        L_0x01d0:
            boolean r8 = r7.isPresent()
            if (r8 == 0) goto L_0x01ee
            java.lang.Object r7 = r7.get()
            java.lang.String r7 = (java.lang.String) r7
            r11.copyOnWrite()
            com.google.protobuf.bv r8 = r11.instance
            com.google.assistant.s.a.bp r8 = (com.google.assistant.p3994s.p3995a.C53106bp) r8
            r7.getClass()
            int r9 = r8.f139167a
            r9 = r9 | 8
            r8.f139167a = r9
            r8.f139170d = r7
        L_0x01ee:
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
            j$.util.Optional r7 = p3186j$.util.Optional.m71637of(r8)
        L_0x024e:
            boolean r8 = r7.isPresent()
            r9 = 0
            if (r8 == 0) goto L_0x0271
            java.lang.Object r7 = r7.get()
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
        L_0x0271:
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
            java.lang.String r8 = "open_provider_args"
            java.lang.String r9 = "assistant.api.client_op.OpenProviderArgs"
            java.lang.String r10 = "provider.OPEN"
            com.google.assistant.e.j.dy r7 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61446e(r10, r7, r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61272c(com.google.assistant.e.j.pj, java.lang.String, j$.util.Optional, j$.util.Optional, j$.util.Optional):com.google.assistant.e.j.dy");
    }

    /* renamed from: d */
    public static C51809dy m61273d(C52374pj pjVar, String str, String str2, Optional optional, boolean z) {
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
        if (optional.isPresent()) {
            C51098gh ghVar = (C51098gh) optional.get();
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
        return C33116d.m61450i((C52321nk) myVar.build());
    }

    /* JADX WARNING: type inference failed for: r2v12, types: [com.google.protobuf.bn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.assistant.p3897e.p3921j.C51809dy m61274e(com.google.assistant.p3897e.p3917i.p3918a.C51406gn r2, com.google.assistant.p3897e.p3921j.C52374pj r3, p3186j$.util.Optional r4) {
        /*
            com.google.assistant.e.j.nk r0 = com.google.assistant.p3897e.p3921j.C52321nk.f137326j
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.my r0 = (com.google.assistant.p3897e.p3921j.C52308my) r0
            j$.util.Optional r2 = m61278i(r2)
            boolean r1 = r2.isPresent()
            if (r1 == 0) goto L_0x001f
            java.lang.Object r2 = r2.get()
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
            boolean r2 = r4.isPresent()
            if (r2 == 0) goto L_0x0043
            java.lang.Object r2 = r4.get()
            com.google.assistant.e.c.c.gh r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r2
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.e.j.nk r3 = (com.google.assistant.p3897e.p3921j.C52321nk) r3
            r2.getClass()
            r3.f137333f = r2
        L_0x0043:
            com.google.protobuf.bv r2 = r0.build()
            com.google.assistant.e.j.nk r2 = (com.google.assistant.p3897e.p3921j.C52321nk) r2
            com.google.assistant.e.j.dy r2 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61450i(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61274e(com.google.assistant.e.i.a.gn, com.google.assistant.e.j.pj, j$.util.Optional):com.google.assistant.e.j.dy");
    }

    /* JADX WARNING: type inference failed for: r12v23, types: [com.google.protobuf.bn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.assistant.p3897e.p3921j.p3926e.C51941eu m61275f(android.content.Context r8, com.google.assistant.p3897e.p3921j.p3926e.C51941eu r9, p3186j$.util.Optional r10, p3186j$.util.Optional r11, p3186j$.util.Optional r12, p3186j$.util.Optional r13) {
        /*
            int r0 = r9.f136277e
            r1 = 4
            if (r0 != r1) goto L_0x000a
            java.lang.Object r0 = r9.f136278f
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
            boolean r2 = r10.isPresent()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0083
            android.content.res.Resources r2 = r8.getResources()
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Object r6 = r10.get()
            r5[r3] = r6
            boolean r6 = r11.isPresent()
            if (r6 == 0) goto L_0x0061
            java.lang.Object r6 = r11.get()
            com.google.assistant.e.c.c.gh r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r6
            int r7 = r6.f133012b
            if (r7 != r4) goto L_0x0042
            java.lang.Object r6 = r6.f133013c
            com.google.assistant.e.c.c.ev r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r6
            goto L_0x0044
        L_0x0042:
            com.google.assistant.e.c.c.ev r6 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x0044:
            int r6 = r6.f132943a
            r6 = r6 & r4
            if (r6 == 0) goto L_0x0061
            java.lang.Object r6 = r11.get()
            com.google.assistant.e.c.c.gh r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r6
            int r7 = r6.f133012b
            if (r7 != r4) goto L_0x0058
            java.lang.Object r6 = r6.f133013c
            com.google.assistant.e.c.c.ev r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r6
            goto L_0x005a
        L_0x0058:
            com.google.assistant.e.c.c.ev r6 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x005a:
            java.lang.String r6 = r6.f132944b
            java.lang.String r6 = m61280k(r8, r6)
            goto L_0x006c
        L_0x0061:
            android.content.res.Resources r6 = r8.getResources()
            r7 = 2132085235(0x7f1509f3, float:1.9810663E38)
            java.lang.String r6 = r6.getString(r7)
        L_0x006c:
            r5[r4] = r6
            r6 = 2132085212(0x7f1509dc, float:1.9810616E38)
            java.lang.String r2 = r2.getString(r6, r5)
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.assistant.e.c.c.hx r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r5
            r2.getClass()
            r5.f133122b = r4
            r5.f133123c = r2
        L_0x0083:
            boolean r2 = r10.isPresent()
            if (r2 == 0) goto L_0x00c6
            com.google.assistant.e.c.c.dc r2 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.c.c.db r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51011db) r2
            boolean r5 = r12.isPresent()
            if (r5 == 0) goto L_0x00a4
            java.lang.Object r12 = r12.get()
            com.google.assistant.e.c.c.dc r12 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r12
            com.google.protobuf.bn r12 = r12.toBuilder()
            r2 = r12
            com.google.assistant.e.c.c.db r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51011db) r2
        L_0x00a4:
            java.lang.Object r10 = r10.get()
            java.lang.String r10 = (java.lang.String) r10
            r2.copyOnWrite()
            com.google.protobuf.bv r12 = r2.instance
            com.google.assistant.e.c.c.dc r12 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r12
            r10.getClass()
            int r5 = r12.f132815a
            r5 = r5 | 2048(0x800, float:2.87E-42)
            r12.f132815a = r5
            r12.f132824j = r10
            com.google.protobuf.bv r10 = r2.build()
            com.google.assistant.e.c.c.dc r10 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r10
            j$.util.Optional r12 = p3186j$.util.Optional.m71637of(r10)
        L_0x00c6:
            boolean r10 = r12.isPresent()
            if (r10 == 0) goto L_0x013b
            java.lang.Object r10 = r12.get()
            com.google.assistant.e.c.c.dc r10 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r10
            com.google.protobuf.bn r10 = r10.toBuilder()
            com.google.assistant.e.c.c.db r10 = (com.google.assistant.p3897e.p3902c.p3907c.C51011db) r10
            boolean r12 = r11.isPresent()
            if (r12 == 0) goto L_0x0123
            com.google.assistant.e.c.c.dc r12 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.assistant.e.c.c.db r12 = (com.google.assistant.p3897e.p3902c.p3907c.C51011db) r12
            java.lang.Object r2 = r11.get()
            com.google.assistant.e.c.c.gh r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r2
            int r5 = r2.f133012b
            if (r5 != r4) goto L_0x00f5
            java.lang.Object r2 = r2.f133013c
            com.google.assistant.e.c.c.ev r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r2
            goto L_0x00f7
        L_0x00f5:
            com.google.assistant.e.c.c.ev r2 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x00f7:
            java.lang.String r2 = r2.f132944b
            r12.copyOnWrite()
            com.google.protobuf.bv r5 = r12.instance
            com.google.assistant.e.c.c.dc r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r5
            r2.getClass()
            int r6 = r5.f132815a
            r6 = r6 | 32
            r5.f132815a = r6
            r5.f132821g = r2
            r10.copyOnWrite()
            com.google.protobuf.bv r2 = r10.instance
            com.google.assistant.e.c.c.dc r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r2
            com.google.protobuf.bv r12 = r12.build()
            com.google.assistant.e.c.c.dc r12 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r12
            r12.getClass()
            r2.f132823i = r12
            int r12 = r2.f132815a
            r12 = r12 | 1024(0x400, float:1.435E-42)
            r2.f132815a = r12
        L_0x0123:
            r0.copyOnWrite()
            com.google.protobuf.bv r12 = r0.instance
            com.google.assistant.e.c.c.hx r12 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r12
            com.google.protobuf.bv r10 = r10.build()
            com.google.assistant.e.c.c.dc r10 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r10
            r10.getClass()
            r12.f133126f = r10
            int r10 = r12.f133121a
            r10 = r10 | 16
            r12.f133121a = r10
        L_0x013b:
            com.google.protobuf.bn r10 = r9.toBuilder()
            com.google.assistant.e.j.e.eq r10 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r10
            int r12 = r9.f136277e
            if (r12 != r1) goto L_0x014a
            java.lang.Object r9 = r9.f136278f
            com.google.assistant.e.c.c.co r9 = (com.google.assistant.p3897e.p3902c.p3907c.C50997co) r9
            goto L_0x014c
        L_0x014a:
            com.google.assistant.e.c.c.co r9 = com.google.assistant.p3897e.p3902c.p3907c.C50997co.f132759h
        L_0x014c:
            com.google.protobuf.bn r9 = r9.toBuilder()
            com.google.assistant.e.c.c.cl r9 = (com.google.assistant.p3897e.p3902c.p3907c.C50994cl) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r12 = r9.instance
            com.google.assistant.e.c.c.co r12 = (com.google.assistant.p3897e.p3902c.p3907c.C50997co) r12
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.c.c.hx r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r0
            r0.getClass()
            r12.f132767g = r0
            int r0 = r12.f132761a
            r0 = r0 | 128(0x80, float:1.794E-43)
            r12.f132761a = r0
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.assistant.e.j.e.eu r12 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r12
            com.google.protobuf.bv r9 = r9.build()
            com.google.assistant.e.c.c.co r9 = (com.google.assistant.p3897e.p3902c.p3907c.C50997co) r9
            r9.getClass()
            r12.f136278f = r9
            r12.f136277e = r1
            boolean r9 = r11.isPresent()
            r12 = 22
            if (r9 == 0) goto L_0x0271
            java.lang.Object r8 = r11.get()
            com.google.assistant.e.c.c.gh r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r8
            int r9 = r8.f133012b
            if (r9 != r4) goto L_0x0195
            java.lang.Object r9 = r8.f133013c
            com.google.assistant.e.c.c.ev r9 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r9
            goto L_0x0197
        L_0x0195:
            com.google.assistant.e.c.c.ev r9 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x0197:
            int r9 = r9.f132943a
            r9 = r9 & r4
            if (r9 == 0) goto L_0x0262
            boolean r9 = r13.isPresent()
            if (r9 == 0) goto L_0x0262
            java.lang.Object r9 = r13.get()
            com.google.assistant.e.j.yz r9 = (com.google.assistant.p3897e.p3921j.C52633yz) r9
            com.google.assistant.e.j.yf r9 = r9.f138197d
            if (r9 != 0) goto L_0x01ae
            com.google.assistant.e.j.yf r9 = com.google.assistant.p3897e.p3921j.C52613yf.f138138f
        L_0x01ae:
            int r9 = r9.f138140a
            r9 = r9 & r1
            if (r9 == 0) goto L_0x0262
            java.lang.Object r9 = r13.get()
            com.google.assistant.e.j.yz r9 = (com.google.assistant.p3897e.p3921j.C52633yz) r9
            int r9 = r9.f138194a
            r9 = r9 & 8
            if (r9 == 0) goto L_0x0262
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            java.lang.String r11 = "android.intent.action.VIEW"
            r9.setAction(r11)
            int r11 = r8.f133012b
            if (r11 != r4) goto L_0x01d2
            java.lang.Object r11 = r8.f133013c
            com.google.assistant.e.c.c.ev r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r11
            goto L_0x01d4
        L_0x01d2:
            com.google.assistant.e.c.c.ev r11 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x01d4:
            java.lang.String r11 = r11.f132944b
            r9.setPackage(r11)
            java.lang.Object r11 = r13.get()
            com.google.assistant.e.j.yz r11 = (com.google.assistant.p3897e.p3921j.C52633yz) r11
            long r0 = r11.f138198e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r2 = "content://com.android.contacts/data/"
            r11.<init>(r2)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            android.net.Uri r11 = android.net.Uri.parse(r11)
            java.lang.Object r13 = r13.get()
            com.google.assistant.e.j.yz r13 = (com.google.assistant.p3897e.p3921j.C52633yz) r13
            com.google.assistant.e.j.yf r13 = r13.f138197d
            if (r13 != 0) goto L_0x01ff
            com.google.assistant.e.j.yf r13 = com.google.assistant.p3897e.p3921j.C52613yf.f138138f
        L_0x01ff:
            java.lang.String r13 = r13.f138143d
            r9.setDataAndType(r11, r13)
            com.google.assistant.e.c.c.ev r11 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.e.c.c.es r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51055es) r11
            int r13 = r8.f133012b
            if (r13 != r4) goto L_0x0215
            java.lang.Object r8 = r8.f133013c
            com.google.assistant.e.c.c.ev r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r8
            goto L_0x0217
        L_0x0215:
            com.google.assistant.e.c.c.ev r8 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x0217:
            java.lang.String r8 = r8.f132944b
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.assistant.e.c.c.ev r13 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r13
            r8.getClass()
            int r0 = r13.f132943a
            r0 = r0 | r4
            r13.f132943a = r0
            r13.f132944b = r8
            java.lang.String r8 = r9.toUri(r3)
            r11.copyOnWrite()
            com.google.protobuf.bv r9 = r11.instance
            com.google.assistant.e.c.c.ev r9 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r9
            r8.getClass()
            int r13 = r9.f132943a
            r13 = r13 | 32
            r9.f132943a = r13
            r9.f132949g = r8
            com.google.assistant.e.c.c.gh r8 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.c.c.gg r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51097gg) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.e.c.c.gh r9 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r9
            com.google.protobuf.bv r11 = r11.build()
            com.google.assistant.e.c.c.ev r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r11
            r11.getClass()
            r9.f133013c = r11
            r9.f133012b = r4
            com.google.protobuf.bv r8 = r8.build()
            com.google.assistant.e.c.c.gh r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r8
        L_0x0262:
            r10.copyOnWrite()
            com.google.protobuf.bv r9 = r10.instance
            com.google.assistant.e.j.e.eu r9 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r9
            r8.getClass()
            r9.f136276d = r8
            r9.f136275c = r12
            goto L_0x0283
        L_0x0271:
            com.google.assistant.e.c.c.gh r8 = m61270a(r8)
            r10.copyOnWrite()
            com.google.protobuf.bv r9 = r10.instance
            com.google.assistant.e.j.e.eu r9 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r9
            r8.getClass()
            r9.f136276d = r8
            r9.f136275c = r12
        L_0x0283:
            com.google.protobuf.bv r8 = r10.build()
            com.google.assistant.e.j.e.eu r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61275f(android.content.Context, com.google.assistant.e.j.e.eu, j$.util.Optional, j$.util.Optional, j$.util.Optional, j$.util.Optional):com.google.assistant.e.j.e.eu");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0067  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.p4522b.C58485gu m61276g(com.google.assistant.p3897e.p3921j.C52374pj r4, java.lang.String r5, java.lang.String r6, p3186j$.util.Optional r7, boolean r8, com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n r9) {
        /*
            com.google.protobuf.bn r9 = r9.toBuilder()
            com.google.protos.f.b.b.a.e r9 = (com.google.protos.p4985f.p4988b.p4990b.p4991a.C64726e) r9
            boolean r0 = r7.isPresent()
            r1 = 1
            if (r0 == 0) goto L_0x0041
            java.lang.Object r0 = r7.get()
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
            r9.copyOnWrite()
            com.google.protobuf.bv r3 = r9.instance
            com.google.protos.f.b.b.a.n r3 = (com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n) r3
            int r0 = r0.getNumber()
            r3.f175469a = r0
            r9.copyOnWrite()
            com.google.protobuf.bv r0 = r9.instance
            com.google.protos.f.b.b.a.n r0 = (com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n) r0
            r0.f175474f = r2
            goto L_0x0050
        L_0x0041:
            com.google.protos.f.b.b.a.i r0 = com.google.protos.p4985f.p4988b.p4990b.p4991a.C64730i.WAIT_FOR_KEYBOARD_UP
            r9.copyOnWrite()
            com.google.protobuf.bv r2 = r9.instance
            com.google.protos.f.b.b.a.n r2 = (com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n) r2
            int r0 = r0.getNumber()
            r2.f175469a = r0
        L_0x0050:
            com.google.protobuf.bv r9 = r9.build()
            com.google.protos.f.b.b.a.n r9 = (com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n) r9
            if (r8 == 0) goto L_0x0067
            com.google.assistant.e.j.dy r4 = m61273d(r4, r5, r6, r7, r1)
            com.google.assistant.e.j.dy r5 = f88443a
            com.google.assistant.e.j.dy r6 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61453l(r9)
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89848p(r4, r5, r6)
            return r4
        L_0x0067:
            com.google.assistant.e.j.dy r8 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61453l(r9)
            com.google.assistant.e.j.dy r4 = m61273d(r4, r5, r6, r7, r1)
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89847o(r8, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61276g(com.google.assistant.e.j.pj, java.lang.String, java.lang.String, j$.util.Optional, boolean, com.google.protos.f.b.b.a.n):com.google.common.b.gu");
    }

    /* renamed from: h */
    public static Optional m61277h(C51406gn gnVar) {
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
                return Optional.m71637of((C51458il) obj);
            }
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f88445c.mo56225c()).mo56382g(e)).mo56372aa(50846)).mo56386p("Incompatible CommunicationFluidActionsData proto implementations");
        }
        return Optional.empty();
    }

    /* renamed from: i */
    public static Optional m61278i(C51406gn gnVar) {
        Optional h = m61277h(gnVar);
        if (h.isPresent() && (((C51458il) h.get()).f134045a & 16) != 0) {
            C51466it itVar = ((C51458il) h.get()).f134050f;
            if (itVar == null) {
                itVar = C51466it.f134076d;
            }
            if ((itVar.f134078a & 1) != 0) {
                C52321nk nkVar = itVar.f134079b;
                if (nkVar == null) {
                    nkVar = C52321nk.f137326j;
                }
                return Optional.m71637of(nkVar);
            }
        }
        return Optional.empty();
    }

    /* renamed from: j */
    public static Optional m61279j(C52070ec ecVar) {
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
                        return Optional.m71637of(((C52217jo) C62942bv.parseFrom((C62942bv) C52217jo.f137027b, kaVar2.f137061c, C62921ba.m95368a())).f137029a);
                    } catch (C62974ct unused) {
                        ((C59052c) ((C59052c) f88445c.mo56225c()).mo56372aa(50847)).mo56386p("Incompatible person proto implementations.");
                        return Optional.empty();
                    }
                }
            }
        }
        return Optional.empty();
    }

    /* renamed from: k */
    public static String m61280k(Context context, String str) {
        CharSequence applicationLabel;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
            if (!(applicationInfo == null || (applicationLabel = context.getPackageManager().getApplicationLabel(applicationInfo)) == null)) {
                return applicationLabel.toString();
            }
        } catch (PackageManager.NameNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f88445c.mo56226d()).mo56382g(e)).mo56372aa(50850)).mo56389s("Package not found: %s", str);
        }
        return context.getResources().getString(R.string.assistantactions_sms_provider_name);
    }

    /* renamed from: l */
    public static String m61281l(Context context) {
        return Telephony.Sms.getDefaultSmsPackage(context);
    }

    /* renamed from: m */
    public static List m61282m(C52623yp ypVar) {
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

    /* renamed from: n */
    public static boolean m61283n(C51406gn gnVar) {
        Optional h = m61277h(gnVar);
        if (!h.isPresent()) {
            return false;
        }
        C51466it itVar = ((C51458il) h.get()).f134050f;
        if (itVar == null) {
            itVar = C51466it.f134076d;
        }
        C51465is a = C51465is.m86194a(itVar.f134080c);
        if (a == null) {
            a = C51465is.UNKNOWN;
        }
        C51401gi giVar = C51401gi.CONTROLLER_STATE_UNKNOWN;
        switch (a.ordinal()) {
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

    /* renamed from: o */
    public static boolean m61284o(C51401gi giVar) {
        C51465is isVar = C51465is.UNKNOWN;
        C51401gi giVar2 = C51401gi.CONTROLLER_STATE_UNKNOWN;
        int ordinal = giVar.ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 5 || ordinal == 6 || ordinal == 11 || ordinal == 16 || ordinal == 17;
    }

    /* renamed from: p */
    public static boolean m61285p(C51401gi giVar) {
        C51465is isVar = C51465is.UNKNOWN;
        C51401gi giVar2 = C51401gi.CONTROLLER_STATE_UNKNOWN;
        int ordinal = giVar.ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 5 || ordinal == 6 || ordinal == 11 || ordinal == 17;
    }

    /* renamed from: q */
    public static boolean m61286q(C51401gi giVar) {
        C51465is isVar = C51465is.UNKNOWN;
        C51401gi giVar2 = C51401gi.CONTROLLER_STATE_UNKNOWN;
        int ordinal = giVar.ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 5 || ordinal == 6 || ordinal == 16 || ordinal == 17;
    }

    /* renamed from: r */
    public static boolean m61287r(C51401gi giVar) {
        C51465is isVar = C51465is.UNKNOWN;
        C51401gi giVar2 = C51401gi.CONTROLLER_STATE_UNKNOWN;
        int ordinal = giVar.ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 5 || ordinal == 6 || ordinal == 9 || ordinal == 16 || ordinal == 17;
    }

    /* renamed from: s */
    public static boolean m61288s(C51401gi giVar) {
        C51465is isVar = C51465is.UNKNOWN;
        C51401gi giVar2 = C51401gi.CONTROLLER_STATE_UNKNOWN;
        int ordinal = giVar.ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 5 || ordinal == 6 || ordinal == 9 || ordinal == 17;
    }

    /* renamed from: t */
    public static boolean m61289t(C51401gi giVar, C51953ff ffVar) {
        if (C33136x.m61490g("audio_message_form_field_id", ffVar).isPresent()) {
            return false;
        }
        C51465is isVar = C51465is.UNKNOWN;
        C51401gi giVar2 = C51401gi.CONTROLLER_STATE_UNKNOWN;
        int ordinal = giVar.ordinal();
        if (ordinal == 9 || ordinal == 10 || ordinal == 16 || ordinal == 17) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m61290u(com.google.assistant.p3897e.p3917i.p3918a.C51406gn r6) {
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
            com.google.common.f.e r6 = f88445c
            com.google.common.f.x r6 = r6.mo56224b()
            java.lang.String r0 = "Messaging App not supported in OnMyWayHome flow"
            r1 = 50851(0xc6a3, float:7.1257E-41)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61290u(com.google.assistant.e.i.a.gn):boolean");
    }

    /* renamed from: v */
    public static boolean m61291v(C51401gi giVar, Optional optional, C32951d dVar) {
        C51058ev evVar;
        if (optional.isPresent()) {
            C51098gh ghVar = (C51098gh) optional.get();
            if (ghVar.f133012b == 1) {
                evVar = (C51058ev) ghVar.f133013c;
            } else {
                evVar = C51058ev.f132941o;
            }
            String str = evVar.f132944b;
            C58485gu<C51058ev> e = dVar.mo38373e();
            if (!str.isEmpty()) {
                for (C51058ev evVar2 : e) {
                    if (evVar2.f132944b.equals(str)) {
                    }
                }
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

    /* renamed from: w */
    public static boolean m61292w(C51401gi giVar) {
        C51465is isVar = C51465is.UNKNOWN;
        C51401gi giVar2 = C51401gi.CONTROLLER_STATE_UNKNOWN;
        int ordinal = giVar.ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 5 || ordinal == 6 || ordinal == 11 || ordinal == 16 || ordinal == 17;
    }

    /* renamed from: x */
    public static boolean m61293x(C51401gi giVar) {
        C51465is isVar = C51465is.UNKNOWN;
        C51401gi giVar2 = C51401gi.CONTROLLER_STATE_UNKNOWN;
        int ordinal = giVar.ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 5 || ordinal == 6 || ordinal == 11 || ordinal == 17;
    }

    /* renamed from: y */
    public static C51809dy m61294y(C52374pj pjVar, String str, Optional optional) {
        C52308my myVar = (C52308my) C52321nk.f137326j.createBuilder();
        myVar.copyOnWrite();
        pjVar.getClass();
        ((C52321nk) myVar.instance).f137331d = pjVar;
        C52311na naVar = (C52311na) C52312nb.f137312c.createBuilder();
        naVar.mo53829b(str);
        naVar.copyOnWrite();
        ((C52312nb) naVar.instance).f137315b = "audio/mpeg";
        myVar.copyOnWrite();
        C52321nk nkVar = (C52321nk) myVar.instance;
        C52312nb nbVar = (C52312nb) naVar.build();
        nbVar.getClass();
        nkVar.f137329b = nbVar;
        nkVar.f137328a = 13;
        if (optional.isPresent()) {
            C51098gh ghVar = (C51098gh) optional.get();
            myVar.copyOnWrite();
            ghVar.getClass();
            ((C52321nk) myVar.instance).f137333f = ghVar;
        }
        return C33116d.m61450i((C52321nk) myVar.build());
    }
}
