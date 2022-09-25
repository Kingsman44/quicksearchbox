package com.google.android.apps.gsa.staticplugins.opamediaplayer;

import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.be */
/* compiled from: PG */
public final /* synthetic */ class C115160be implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C115162bg f319607a;

    /* renamed from: b */
    public final /* synthetic */ int f319608b;

    public /* synthetic */ C115160be(C115162bg bgVar, int i) {
        this.f319607a = bgVar;
        this.f319608b = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x038e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            com.google.android.apps.gsa.staticplugins.opamediaplayer.bg r1 = r0.f319607a
            int r2 = r0.f319608b
            r3 = r18
            com.google.assistant.e.j.hz r3 = (com.google.assistant.p3897e.p3921j.C52174hz) r3
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            com.google.assistant.e.j.wo r5 = r3.f136897d
            if (r5 != 0) goto L_0x0015
            com.google.assistant.e.j.wo r5 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v
        L_0x0015:
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.a r6 = r1.f319612c
            com.google.protobuf.bv r6 = r6.instance
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.f r6 = (com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115169f) r6
            com.google.assistant.e.j.ia r6 = r6.f319628b
            if (r6 != 0) goto L_0x0021
            com.google.assistant.e.j.ia r6 = com.google.assistant.p3897e.p3921j.C52176ia.f136911k
        L_0x0021:
            int r6 = r6.f136913a
            r6 = r6 & 16
            if (r6 == 0) goto L_0x003a
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.a r6 = r1.f319612c
            com.google.protobuf.bv r6 = r6.instance
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.f r6 = (com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115169f) r6
            com.google.assistant.e.j.ia r6 = r6.f319628b
            if (r6 != 0) goto L_0x0033
            com.google.assistant.e.j.ia r6 = com.google.assistant.p3897e.p3921j.C52176ia.f136911k
        L_0x0033:
            java.lang.String r7 = "assistant.api.params.MediaParams.MediaSession.SessionId"
            long r8 = r6.f136917e
            r4.putLong(r7, r8)
        L_0x003a:
            int r6 = r3.f136894a
            r7 = 1
            r6 = r6 & r7
            if (r6 == 0) goto L_0x0047
            java.lang.String r6 = "android.media.metadata.MEDIA_URI"
            java.lang.String r8 = r3.f136895b
            r4.putString(r6, r8)
        L_0x0047:
            int r6 = r5.f137994a
            r6 = r6 & r7
            if (r6 == 0) goto L_0x0053
            java.lang.String r6 = "android.media.metadata.TITLE"
            java.lang.String r8 = r5.f137998e
            r4.putString(r6, r8)
        L_0x0053:
            int r6 = r5.f137994a
            r6 = r6 & 8
            if (r6 == 0) goto L_0x0060
            java.lang.String r6 = "android.media.metadata.ALBUM"
            java.lang.String r8 = r5.f138000g
            r4.putString(r6, r8)
        L_0x0060:
            int r6 = r5.f137994a
            r6 = r6 & 32
            if (r6 == 0) goto L_0x006d
            java.lang.String r6 = "android.media.metadata.DISPLAY_DESCRIPTION"
            java.lang.String r8 = r5.f138002i
            r4.putString(r6, r8)
        L_0x006d:
            com.google.assistant.e.c.c.dc r6 = r5.f138004k
            if (r6 != 0) goto L_0x0073
            com.google.assistant.e.c.c.dc r6 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0073:
            int r6 = r6.f132815a
            r6 = r6 & 8
            r8 = 0
            if (r6 == 0) goto L_0x0093
            com.google.assistant.e.c.c.dc r6 = r5.f138004k
            if (r6 != 0) goto L_0x0080
            com.google.assistant.e.c.c.dc r6 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0080:
            com.google.protobuf.z r6 = r6.f132819e
            byte[] r9 = r6.mo59174N()
            int r6 = r6.mo59031d()
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeByteArray(r9, r8, r6)
            java.lang.String r9 = "android.media.metadata.DISPLAY_ICON"
            r4.putParcelable(r9, r6)
        L_0x0093:
            com.google.assistant.e.c.c.dc r6 = r5.f138004k
            if (r6 != 0) goto L_0x009a
            com.google.assistant.e.c.c.dc r9 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
            goto L_0x009b
        L_0x009a:
            r9 = r6
        L_0x009b:
            int r9 = r9.f132815a
            r10 = 2
            r9 = r9 & r10
            if (r9 == 0) goto L_0x00ac
            if (r6 != 0) goto L_0x00a5
            com.google.assistant.e.c.c.dc r6 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x00a5:
            java.lang.String r9 = "android.media.metadata.DISPLAY_ICON_URI"
            java.lang.String r6 = r6.f132817c
            r4.putString(r9, r6)
        L_0x00ac:
            java.lang.String r6 = "android.media.metadata.TRACK_NUMBER"
            long r11 = (long) r2
            r4.putLong(r6, r11)
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.a r6 = r1.f319612c
            com.google.protobuf.bv r6 = r6.instance
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.f r6 = (com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115169f) r6
            com.google.assistant.e.j.ia r6 = r6.f319628b
            if (r6 != 0) goto L_0x00be
            com.google.assistant.e.j.ia r6 = com.google.assistant.p3897e.p3921j.C52176ia.f136911k
        L_0x00be:
            com.google.protobuf.cq r6 = r6.f136914b
            int r6 = r6.size()
            int r6 = r6 + -1
            r11 = 0
            if (r2 >= r6) goto L_0x00cd
            r13 = 32
            goto L_0x00ce
        L_0x00cd:
            r13 = r11
        L_0x00ce:
            if (r2 <= 0) goto L_0x00d3
            r15 = 16
            long r13 = r13 | r15
        L_0x00d3:
            java.lang.String r2 = "com.google.android.apps.gsa.search.core.work.audioplayer.SkipActions"
            r4.putLong(r2, r13)
            com.google.common.base.ax r2 = com.google.android.apps.gsa.staticplugins.opamediaplayer.p8651g.C115485b.m191567a(r3)
            java.lang.Object r2 = r2.mo56111f()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r6 = "android.media.metadata.MEDIA_ID"
            r4.putString(r6, r2)
            com.google.protobuf.cq r2 = r3.f136899f
            java.util.ArrayList r2 = com.google.android.apps.gsa.staticplugins.opamediaplayer.C115162bg.m190908c(r2)
            com.google.android.apps.gsa.search.core.i.t r6 = r1.f319611b
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247491iE
            boolean r6 = r6.mo79746e(r9)
            if (r6 != 0) goto L_0x0103
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto L_0x0103
            java.lang.String r6 = "com.google.android.apps.gsa.search.core.work.audioplayer.MediaIntroUrls"
            r4.putStringArrayList(r6, r2)
            goto L_0x0110
        L_0x0103:
            int r2 = r3.f136894a
            r2 = r2 & 16
            if (r2 == 0) goto L_0x0110
            java.lang.String r2 = "com.google.android.apps.gsa.search.core.work.audioplayer.StartPosition"
            long r13 = r3.f136898e
            r4.putLong(r2, r13)
        L_0x0110:
            com.google.protobuf.cq r2 = r3.f136900g
            java.util.ArrayList r2 = com.google.android.apps.gsa.staticplugins.opamediaplayer.C115162bg.m190908c(r2)
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto L_0x0121
            java.lang.String r6 = "com.google.android.apps.gsa.search.core.work.audioplayer.MediaOutroUrls"
            r4.putStringArrayList(r6, r2)
        L_0x0121:
            com.google.assistant.e.j.wo r2 = r3.f136897d
            if (r2 != 0) goto L_0x0127
            com.google.assistant.e.j.wo r2 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v
        L_0x0127:
            int r2 = r2.f138003j
            com.google.assistant.e.j.wn r2 = com.google.assistant.p3897e.p3921j.C52567wn.m86649b(r2)
            if (r2 != 0) goto L_0x0131
            com.google.assistant.e.j.wn r2 = com.google.assistant.p3897e.p3921j.C52567wn.UNKNOWN
        L_0x0131:
            com.google.assistant.e.j.wn r6 = com.google.assistant.p3897e.p3921j.C52567wn.NARRATED_WEB
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0143
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f319611b
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90125fw.f250892I
            boolean r2 = r2.mo79746e(r6)
            if (r2 == 0) goto L_0x0163
        L_0x0143:
            java.lang.String r2 = "com.google.android.apps.gsa.search.core.work.audioplayer.QoeNamespace"
            java.lang.String r6 = "op"
            r4.putString(r2, r6)
            com.google.assistant.e.j.wo r2 = r3.f136897d
            if (r2 != 0) goto L_0x0150
            com.google.assistant.e.j.wo r2 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v
        L_0x0150:
            int r2 = r2.f138003j
            com.google.assistant.e.j.wn r2 = com.google.assistant.p3897e.p3921j.C52567wn.m86649b(r2)
            if (r2 != 0) goto L_0x015a
            com.google.assistant.e.j.wn r2 = com.google.assistant.p3897e.p3921j.C52567wn.UNKNOWN
        L_0x015a:
            java.lang.String r6 = "com.google.android.apps.gsa.search.core.work.audioplayer.QoeContentType"
            java.lang.String r2 = r2.name()
            r4.putString(r6, r2)
        L_0x0163:
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f319611b
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90049da.f248762d
            boolean r2 = r2.mo79746e(r6)
            if (r2 == 0) goto L_0x017c
            int r2 = r5.f137996c
            r5 = 41
            if (r2 != r5) goto L_0x017c
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.a r2 = r1.f319612c
            com.google.protobuf.bv r2 = r2.instance
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.f r2 = (com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115169f) r2
            float r2 = r2.f319631e
            goto L_0x0184
        L_0x017c:
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.a r2 = r1.f319612c
            com.google.protobuf.bv r2 = r2.instance
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.f r2 = (com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115169f) r2
            float r2 = r2.f319630d
        L_0x0184:
            java.lang.String r5 = "com.google.android.apps.gsa.search.core.work.audioplayer.PlaybackSpeed"
            r4.putFloat(r5, r2)
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.a r2 = r1.f319612c
            com.google.protobuf.bv r2 = r2.instance
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.f r2 = (com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115169f) r2
            int r5 = r2.f319627a
            r5 = r5 & 16
            if (r5 == 0) goto L_0x01d3
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.e r2 = r2.f319632f
            if (r2 != 0) goto L_0x019b
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.e r2 = com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115168e.f319620c
        L_0x019b:
            int r2 = r2.f319622a
            r2 = r2 & r7
            if (r2 == 0) goto L_0x01d3
            android.content.Context r2 = r1.f319610a
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.a r5 = r1.f319612c
            com.google.protobuf.bv r5 = r5.instance
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.f r5 = (com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115169f) r5
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.e r5 = r5.f319632f
            if (r5 != 0) goto L_0x01ae
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.e r5 = com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115168e.f319620c
        L_0x01ae:
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.d r5 = r5.f319623b
            if (r5 != 0) goto L_0x01b4
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.d r5 = com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115167d.f319614d
        L_0x01b4:
            java.lang.String r5 = r5.f319617b
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.a r6 = r1.f319612c
            com.google.protobuf.bv r6 = r6.instance
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.f r6 = (com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115169f) r6
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.e r6 = r6.f319632f
            if (r6 != 0) goto L_0x01c2
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.e r6 = com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115168e.f319620c
        L_0x01c2:
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.d r6 = r6.f319623b
            if (r6 != 0) goto L_0x01c8
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.d r6 = com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115167d.f319614d
        L_0x01c8:
            com.google.android.apps.gsa.search.shared.service.c.b.bb r6 = r6.f319618c
            if (r6 != 0) goto L_0x01ce
            com.google.android.apps.gsa.search.shared.service.c.b.bb r6 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb.f239082a
        L_0x01ce:
            android.app.PendingIntent r2 = com.google.android.apps.gsa.search.shared.service.p6940d.C88483e.m142827a(r2, r5, r6, r8)
            goto L_0x01ed
        L_0x01d3:
            android.content.Context r2 = r1.f319610a
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.a r5 = r1.f319612c
            com.google.protobuf.bv r5 = r5.instance
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.f r5 = (com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115169f) r5
            com.google.assistant.e.j.ia r5 = r5.f319628b
            if (r5 != 0) goto L_0x01e1
            com.google.assistant.e.j.ia r5 = com.google.assistant.p3897e.p3921j.C52176ia.f136911k
        L_0x01e1:
            com.google.android.apps.gsa.search.core.i.t r6 = r1.f319611b
            android.content.Intent r5 = com.google.android.apps.gsa.staticplugins.opamediaplayer.p8651g.C115484a.m191566a(r5, r6)
            r6 = 67108864(0x4000000, float:1.5046328E-36)
            android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r2, r8, r5, r6)
        L_0x01ed:
            java.lang.String r5 = "com.google.android.apps.gsa.search.core.work.audioplayer.SessionActivity"
            r4.putParcelable(r5, r2)
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f319611b
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90125fw.f250932k
            boolean r2 = r2.mo79746e(r5)
            java.lang.String r5 = "com.google.android.apps.gsa.search.core.work.audioplayer.EnforceSingleThreadedExoPlayer"
            r4.putBoolean(r5, r2)
            com.google.assistant.e.j.wo r2 = r3.f136897d
            if (r2 != 0) goto L_0x0206
            com.google.assistant.e.j.wo r5 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v
            goto L_0x0207
        L_0x0206:
            r5 = r2
        L_0x0207:
            int r5 = r5.f137996c
            java.lang.String r6 = "com.google.android.apps.gsa.search.core.work.audioplayer.CloseButtonInNotificationStyle"
            r9 = 18
            if (r5 != r9) goto L_0x0256
            if (r2 != 0) goto L_0x0213
            com.google.assistant.e.j.wo r2 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v
        L_0x0213:
            int r5 = r2.f137996c
            if (r5 != r9) goto L_0x021c
            java.lang.Object r2 = r2.f137997d
            com.google.assistant.e.j.wu r2 = (com.google.assistant.p3897e.p3921j.C52574wu) r2
            goto L_0x021e
        L_0x021c:
            com.google.assistant.e.j.wu r2 = com.google.assistant.p3897e.p3921j.C52574wu.f138026h
        L_0x021e:
            java.lang.String r2 = r2.f138034g
            boolean r5 = com.google.common.base.C58837ba.m90859h(r2)
            if (r5 != 0) goto L_0x022b
            java.lang.String r5 = "com.google.android.apps.gsa.search.core.work.audioplayer.PodcastFeedUrl"
            r4.putString(r5, r2)
        L_0x022b:
            com.google.assistant.e.j.wo r2 = r3.f136897d
            if (r2 != 0) goto L_0x0231
            com.google.assistant.e.j.wo r2 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v
        L_0x0231:
            int r5 = r2.f137996c
            if (r5 != r9) goto L_0x023a
            java.lang.Object r2 = r2.f137997d
            com.google.assistant.e.j.wu r2 = (com.google.assistant.p3897e.p3921j.C52574wu) r2
            goto L_0x023c
        L_0x023a:
            com.google.assistant.e.j.wu r2 = com.google.assistant.p3897e.p3921j.C52574wu.f138026h
        L_0x023c:
            java.lang.String r2 = r2.f138030c
            boolean r5 = com.google.common.base.C58837ba.m90859h(r2)
            if (r5 != 0) goto L_0x0249
            java.lang.String r5 = "com.google.android.apps.gsa.search.core.work.audioplayer.EpisodeGuid"
            r4.putString(r5, r2)
        L_0x0249:
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f319611b
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247492iF
            boolean r2 = r2.mo79746e(r5)
            if (r2 == 0) goto L_0x0256
            r4.putInt(r6, r10)
        L_0x0256:
            com.google.assistant.e.j.wo r2 = r3.f136897d
            if (r2 != 0) goto L_0x025d
            com.google.assistant.e.j.wo r5 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v
            goto L_0x025e
        L_0x025d:
            r5 = r2
        L_0x025e:
            int r5 = r5.f137996c
            r9 = 26
            if (r5 != r9) goto L_0x0340
            if (r2 != 0) goto L_0x0268
            com.google.assistant.e.j.wo r2 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v
        L_0x0268:
            int r5 = r2.f137996c
            if (r5 != r9) goto L_0x0271
            java.lang.Object r2 = r2.f137997d
            com.google.assistant.e.j.xc r2 = (com.google.assistant.p3897e.p3921j.C52583xc) r2
            goto L_0x0273
        L_0x0271:
            com.google.assistant.e.j.xc r2 = com.google.assistant.p3897e.p3921j.C52583xc.f138063o
        L_0x0273:
            int r5 = r2.f138066b
            com.google.assistant.e.j.wz r5 = com.google.assistant.p3897e.p3921j.C52579wz.m86656a(r5)
            if (r5 != 0) goto L_0x027d
            com.google.assistant.e.j.wz r5 = com.google.assistant.p3897e.p3921j.C52579wz.UNKNOWN_READ_STATE
        L_0x027d:
            com.google.assistant.e.j.wz r9 = com.google.assistant.p3897e.p3921j.C52579wz.READ
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x0286
            goto L_0x0289
        L_0x0286:
            int r5 = r2.f138067c
            long r11 = (long) r5
        L_0x0289:
            java.lang.String r5 = "com.google.android.apps.gsa.search.core.work.audioplayer.StartWindowIndex"
            r4.putLong(r5, r11)
            int r5 = r2.f138069e
            com.google.assistant.e.j.wx r5 = com.google.assistant.p3897e.p3921j.C52577wx.m86654a(r5)
            if (r5 != 0) goto L_0x0298
            com.google.assistant.e.j.wx r5 = com.google.assistant.p3897e.p3921j.C52577wx.UNKNOWN_PLAYBACK_TYPE
        L_0x0298:
            java.lang.String r9 = "com.google.android.apps.gsa.search.core.work.audioplayer.SpeakrPlaybackType"
            int r5 = r5.f138041e
            r4.putInt(r9, r5)
            int r5 = r2.f138069e
            com.google.assistant.e.j.wx r5 = com.google.assistant.p3897e.p3921j.C52577wx.m86654a(r5)
            if (r5 != 0) goto L_0x02a9
            com.google.assistant.e.j.wx r5 = com.google.assistant.p3897e.p3921j.C52577wx.UNKNOWN_PLAYBACK_TYPE
        L_0x02a9:
            com.google.assistant.e.j.wx r9 = com.google.assistant.p3897e.p3921j.C52577wx.READ_IT_NOW_SINGLE
            boolean r5 = r5.equals(r9)
            java.lang.String r9 = "com.google.android.apps.gsa.search.core.work.audioplayer.UseExistingSpeakrSession"
            r4.putBoolean(r9, r5)
            com.google.android.apps.gsa.search.core.i.t r5 = r1.f319611b
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90125fw.f250924c
            boolean r5 = r5.mo79746e(r9)
            if (r5 == 0) goto L_0x02c1
            r4.putInt(r6, r7)
        L_0x02c1:
            com.google.protos.f.b.c.p r5 = r2.f138075k
            if (r5 != 0) goto L_0x02c7
            com.google.protos.f.b.c.p r5 = com.google.protos.p4985f.p4988b.p4992c.C64768p.f175564b
        L_0x02c7:
            com.google.protobuf.cq r5 = r5.f175566a
            int r5 = r5.size()
            java.lang.String r6 = "com.google.android.apps.gsa.search.core.work.audioplayer.FreeText"
            if (r5 <= 0) goto L_0x02f6
            java.util.ArrayList r5 = new java.util.ArrayList
            com.google.protos.f.b.c.p r9 = r2.f138075k
            if (r9 != 0) goto L_0x02d9
            com.google.protos.f.b.c.p r9 = com.google.protos.p4985f.p4988b.p4992c.C64768p.f175564b
        L_0x02d9:
            com.google.protobuf.cq r9 = r9.f175566a
            j$.util.stream.Stream r9 = p3186j$.util.Collection.EL.stream(r9)
            com.google.android.apps.gsa.staticplugins.opamediaplayer.bf r11 = com.google.android.apps.gsa.staticplugins.opamediaplayer.C115161bf.f319609a
            j$.util.stream.Stream r9 = r9.map(r11)
            j$.util.stream.Collector r11 = p3186j$.util.stream.Collectors.toList()
            java.lang.Object r9 = r9.collect(r11)
            java.util.Collection r9 = (java.util.Collection) r9
            r5.<init>(r9)
            r4.putStringArrayList(r6, r5)
            goto L_0x0308
        L_0x02f6:
            com.google.protobuf.cq r5 = r2.f138074j
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x0308
            java.util.ArrayList r5 = new java.util.ArrayList
            com.google.protobuf.cq r9 = r2.f138074j
            r5.<init>(r9)
            r4.putStringArrayList(r6, r5)
        L_0x0308:
            int r5 = r2.f138076l
            com.google.assistant.e.j.xb r5 = com.google.assistant.p3897e.p3921j.C52582xb.m86658a(r5)
            if (r5 != 0) goto L_0x0312
            com.google.assistant.e.j.xb r5 = com.google.assistant.p3897e.p3921j.C52582xb.UNKNOWN_TRIGGER_TYPE
        L_0x0312:
            java.lang.String r6 = "com.google.android.apps.gsa.search.core.work.audioplayer.SpeakrTriggerType"
            int r5 = r5.f138062i
            r4.putInt(r6, r5)
            com.google.android.apps.gsa.search.core.i.t r5 = r1.f319611b
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90125fw.f250937p
            boolean r5 = r5.mo79746e(r6)
            if (r5 == 0) goto L_0x032a
            java.lang.String r5 = "com.google.android.apps.gsa.search.core.work.audioplayer.SpeakrUseOnDeviceTts"
            java.lang.String r6 = ""
            r4.putString(r5, r6)
        L_0x032a:
            com.google.assistant.e.j.xk r5 = r2.f138078n
            if (r5 != 0) goto L_0x0330
            com.google.assistant.e.j.xk r5 = com.google.assistant.p3897e.p3921j.C52591xk.f138094b
        L_0x0330:
            java.lang.String r6 = "com.google.android.apps.gsa.search.core.work.audioplayer.SpeakrVoiceSettings"
            byte[] r5 = r5.toByteArray()
            r4.putByteArray(r6, r5)
            java.lang.String r5 = "com.google.android.apps.gsa.search.core.work.audioplayer.SpeakrTargetLanguage"
            java.lang.String r2 = r2.f138071g
            r4.putString(r5, r2)
        L_0x0340:
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f319611b
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247490iD
            boolean r2 = r2.mo79746e(r5)
            if (r2 == 0) goto L_0x0357
            int r2 = r3.f136894a
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0357
            java.lang.String r2 = "com.google.android.apps.gsa.search.core.work.audioplayer.AudioTrackLoudness"
            float r5 = r3.f136904k
            r4.putFloat(r2, r5)
        L_0x0357:
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f319611b
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90049da.f248759a
            boolean r2 = r2.mo79746e(r5)
            if (r2 == 0) goto L_0x0375
            com.google.protobuf.ch r2 = r3.f136905l
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0375
            java.util.ArrayList r2 = new java.util.ArrayList
            com.google.protobuf.ch r3 = r3.f136905l
            r2.<init>(r3)
            java.lang.String r3 = "com.google.android.apps.gsa.search.core.work.audioplayer.IntroAudioChannelList"
            r4.putIntegerArrayList(r3, r2)
        L_0x0375:
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.a r1 = r1.f319612c
            com.google.protobuf.bv r1 = r1.instance
            com.google.android.apps.gsa.staticplugins.opamediaplayer.c.f r1 = (com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115169f) r1
            com.google.assistant.e.j.ia r1 = r1.f319628b
            if (r1 != 0) goto L_0x0381
            com.google.assistant.e.j.ia r1 = com.google.assistant.p3897e.p3921j.C52176ia.f136911k
        L_0x0381:
            int r1 = r1.f136918f
            int r1 = com.google.assistant.p3897e.p3921j.C52201iz.m86539a(r1)
            if (r1 != 0) goto L_0x038a
            r1 = 1
        L_0x038a:
            int r1 = r1 + -1
            if (r1 == r7) goto L_0x0393
            if (r1 == r10) goto L_0x0392
            r7 = 0
            goto L_0x0393
        L_0x0392:
            r7 = 2
        L_0x0393:
            java.lang.String r1 = "com.google.android.apps.gsa.search.core.work.audioplayer.RepeatMode"
            r4.putInt(r1, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opamediaplayer.C115160be.apply(java.lang.Object):java.lang.Object");
    }
}
