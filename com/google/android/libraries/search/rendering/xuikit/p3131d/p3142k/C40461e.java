package com.google.android.libraries.search.rendering.xuikit.p3131d.p3142k;

import android.view.ContextThemeWrapper;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.material.p2206b.C28505a;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3116d.p3117a.C40063a;
import com.google.android.material.p3505b.C44534d;
import com.google.android.material.p3505b.C44535e;
import com.google.android.material.p3512i.C44693c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4410d.C57758a;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4410d.C57759b;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4410d.C57760c;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4410d.C57761d;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.k.e */
/* compiled from: PG */
public final class C40461e implements C40063a {

    /* renamed from: a */
    private static final C59071e f106191a = C59071e.m91332i("com.google.android.libraries.search.rendering.xuikit.d.k.e");

    /* renamed from: b */
    private final ContextThemeWrapper f106192b;

    /* renamed from: c */
    private final boolean f106193c;

    public C40461e(ContextThemeWrapper contextThemeWrapper, boolean z) {
        this.f106192b = contextThemeWrapper;
        this.f106193c = z;
    }

    /* renamed from: b */
    private final C58833ax m70169b(int i) {
        try {
            ContextThemeWrapper contextThemeWrapper = this.f106192b;
            return C58833ax.m90834k(Integer.valueOf(C44535e.m78722e(contextThemeWrapper, C44693c.m79227c(contextThemeWrapper, i, "failed to get color"))));
        } catch (RuntimeException unused) {
            ((C59052c) ((C59052c) f106191a.mo56226d()).mo56372aa(53341)).mo56389s("Failed to get %s value, will return empty", this.f106192b.getResources().getResourceName(i));
            return C58836b.f156633a;
        }
    }

    /* renamed from: a */
    public final C58833ax mo42165a() {
        if (!this.f106193c) {
            return C58836b.f156633a;
        }
        if (!C44534d.m78715b()) {
            return C58836b.f156633a;
        }
        C57758a aVar = (C57758a) C57759b.f154314B.createBuilder();
        C58833ax b = m70169b(R.attr.colorPrimary);
        if (b.mo56113h()) {
            int intValue = ((Integer) b.mo56107c()).intValue();
            aVar.copyOnWrite();
            C57759b bVar = (C57759b) aVar.instance;
            bVar.f154317a |= 1;
            bVar.f154318b = intValue;
        }
        C58833ax b2 = m70169b(R.attr.colorOnPrimary);
        if (b2.mo56113h()) {
            int intValue2 = ((Integer) b2.mo56107c()).intValue();
            aVar.copyOnWrite();
            C57759b bVar2 = (C57759b) aVar.instance;
            bVar2.f154317a |= 2;
            bVar2.f154319c = intValue2;
        }
        C58833ax b3 = m70169b(R.attr.colorPrimaryContainer);
        if (b3.mo56113h()) {
            int intValue3 = ((Integer) b3.mo56107c()).intValue();
            aVar.copyOnWrite();
            C57759b bVar3 = (C57759b) aVar.instance;
            bVar3.f154317a |= 4;
            bVar3.f154320d = intValue3;
        }
        C58833ax b4 = m70169b(R.attr.colorOnPrimaryContainer);
        if (b4.mo56113h()) {
            int intValue4 = ((Integer) b4.mo56107c()).intValue();
            aVar.copyOnWrite();
            C57759b bVar4 = (C57759b) aVar.instance;
            bVar4.f154317a |= 8;
            bVar4.f154321e = intValue4;
        }
        C58833ax b5 = m70169b(R.attr.colorSecondary);
        if (b5.mo56113h()) {
            int intValue5 = ((Integer) b5.mo56107c()).intValue();
            aVar.copyOnWrite();
            C57759b bVar5 = (C57759b) aVar.instance;
            bVar5.f154317a |= 16;
            bVar5.f154322f = intValue5;
        }
        C58833ax b6 = m70169b(R.attr.colorOnSecondary);
        if (b6.mo56113h()) {
            int intValue6 = ((Integer) b6.mo56107c()).intValue();
            aVar.copyOnWrite();
            C57759b bVar6 = (C57759b) aVar.instance;
            bVar6.f154317a |= 32;
            bVar6.f154323g = intValue6;
        }
        C58833ax b7 = m70169b(R.attr.colorSecondaryContainer);
        if (b7.mo56113h()) {
            int intValue7 = ((Integer) b7.mo56107c()).intValue();
            aVar.copyOnWrite();
            C57759b bVar7 = (C57759b) aVar.instance;
            bVar7.f154317a |= 64;
            bVar7.f154324h = intValue7;
        }
        C58833ax b8 = m70169b(R.attr.colorOnSecondaryContainer);
        if (b8.mo56113h()) {
            int intValue8 = ((Integer) b8.mo56107c()).intValue();
            aVar.copyOnWrite();
            C57759b bVar8 = (C57759b) aVar.instance;
            bVar8.f154317a |= 128;
            bVar8.f154325i = intValue8;
        }
        C58833ax b9 = m70169b(R.attr.colorTertiaryContainer);
        if (b9.mo56113h()) {
            int intValue9 = ((Integer) b9.mo56107c()).intValue();
            aVar.copyOnWrite();
            C57759b bVar9 = (C57759b) aVar.instance;
            bVar9.f154317a |= 256;
            bVar9.f154326j = intValue9;
        }
        C58833ax b10 = m70169b(R.attr.colorOnTertiaryContainer);
        if (b10.mo56113h()) {
            int intValue10 = ((Integer) b10.mo56107c()).intValue();
            aVar.copyOnWrite();
            C57759b bVar10 = (C57759b) aVar.instance;
            bVar10.f154317a |= 512;
            bVar10.f154327k = intValue10;
        }
        C58833ax b11 = m70169b(R.attr.colorError);
        if (b11.mo56113h()) {
            int intValue11 = ((Integer) b11.mo56107c()).intValue();
            aVar.copyOnWrite();
            C57759b bVar11 = (C57759b) aVar.instance;
            bVar11.f154317a |= 1024;
            bVar11.f154328l = intValue11;
        }
        C58833ax b12 = m70169b(R.attr.colorOnError);
        if (b12.mo56113h()) {
            int intValue12 = ((Integer) b12.mo56107c()).intValue();
            aVar.copyOnWrite();
            C57759b bVar12 = (C57759b) aVar.instance;
            bVar12.f154317a |= 2048;
            bVar12.f154329m = intValue12;
        }
        C58833ax b13 = m70169b(R.attr.colorOutline);
        if (b13.mo56113h()) {
            int intValue13 = ((Integer) b13.mo56107c()).intValue();
            aVar.copyOnWrite();
            C57759b bVar13 = (C57759b) aVar.instance;
            bVar13.f154317a |= 4096;
            bVar13.f154330n = intValue13;
        }
        C58833ax b14 = m70169b(16842801);
        if (b14.mo56113h()) {
            int intValue14 = ((Integer) b14.mo56107c()).intValue();
            aVar.copyOnWrite();
            C57759b bVar14 = (C57759b) aVar.instance;
            bVar14.f154317a |= 8192;
            bVar14.f154331o = intValue14;
        }
        C58833ax b15 = m70169b(R.attr.colorOnBackground);
        if (b15.mo56113h()) {
            int intValue15 = ((Integer) b15.mo56107c()).intValue();
            aVar.copyOnWrite();
            C57759b bVar15 = (C57759b) aVar.instance;
            bVar15.f154317a |= 16384;
            bVar15.f154332p = intValue15;
        }
        C58833ax b16 = m70169b(R.attr.colorSurface);
        if (b16.mo56113h()) {
            int intValue16 = ((Integer) b16.mo56107c()).intValue();
            aVar.copyOnWrite();
            C57759b bVar16 = (C57759b) aVar.instance;
            bVar16.f154317a |= 32768;
            bVar16.f154333q = intValue16;
        }
        C58833ax b17 = m70169b(R.attr.colorOnSurface);
        if (b17.mo56113h()) {
            int intValue17 = ((Integer) b17.mo56107c()).intValue();
            aVar.copyOnWrite();
            C57759b bVar17 = (C57759b) aVar.instance;
            bVar17.f154317a |= 65536;
            bVar17.f154334r = intValue17;
        }
        C58833ax b18 = m70169b(R.attr.colorSurfaceVariant);
        if (b18.mo56113h()) {
            int intValue18 = ((Integer) b18.mo56107c()).intValue();
            aVar.copyOnWrite();
            C57759b bVar18 = (C57759b) aVar.instance;
            bVar18.f154317a |= C89885b.S3REQUEST_VALUE;
            bVar18.f154335s = intValue18;
        }
        C58833ax b19 = m70169b(R.attr.colorOnSurfaceVariant);
        if (b19.mo56113h()) {
            int intValue19 = ((Integer) b19.mo56107c()).intValue();
            aVar.copyOnWrite();
            C57759b bVar19 = (C57759b) aVar.instance;
            bVar19.f154317a |= C89885b.HTTP_VALUE;
            bVar19.f154336t = intValue19;
        }
        C58833ax b20 = m70169b(R.attr.colorSurfaceInverse);
        if (b20.mo56113h()) {
            int intValue20 = ((Integer) b20.mo56107c()).intValue();
            aVar.copyOnWrite();
            C57759b bVar20 = (C57759b) aVar.instance;
            bVar20.f154317a |= 524288;
            bVar20.f154337u = intValue20;
        }
        C58833ax b21 = m70169b(R.attr.colorOnSurfaceInverse);
        if (b21.mo56113h()) {
            int intValue21 = ((Integer) b21.mo56107c()).intValue();
            aVar.copyOnWrite();
            C57759b bVar21 = (C57759b) aVar.instance;
            bVar21.f154317a |= 1048576;
            bVar21.f154338v = intValue21;
        }
        int a = C28505a.m53283a(R.dimen.gm3_sys_elevation_level1, this.f106192b);
        aVar.copyOnWrite();
        C57759b bVar22 = (C57759b) aVar.instance;
        bVar22.f154317a |= C89885b.NOW_VALUE;
        bVar22.f154339w = a;
        int a2 = C28505a.m53283a(R.dimen.gm3_sys_elevation_level2, this.f106192b);
        aVar.copyOnWrite();
        C57759b bVar23 = (C57759b) aVar.instance;
        bVar23.f154317a |= 4194304;
        bVar23.f154340x = a2;
        int a3 = C28505a.m53283a(R.dimen.gm3_sys_elevation_level3, this.f106192b);
        aVar.copyOnWrite();
        C57759b bVar24 = (C57759b) aVar.instance;
        bVar24.f154317a |= 8388608;
        bVar24.f154341y = a3;
        int a4 = C28505a.m53283a(R.dimen.gm3_sys_elevation_level4, this.f106192b);
        aVar.copyOnWrite();
        C57759b bVar25 = (C57759b) aVar.instance;
        bVar25.f154317a |= 16777216;
        bVar25.f154342z = a4;
        int a5 = C28505a.m53283a(R.dimen.gm3_sys_elevation_level5, this.f106192b);
        aVar.copyOnWrite();
        C57759b bVar26 = (C57759b) aVar.instance;
        bVar26.f154317a |= 33554432;
        bVar26.f154316A = a5;
        C57760c cVar = (C57760c) C57761d.f154343c.createBuilder();
        cVar.copyOnWrite();
        C57761d dVar = (C57761d) cVar.instance;
        C57759b bVar27 = (C57759b) aVar.build();
        bVar27.getClass();
        dVar.f154346b = bVar27;
        dVar.f154345a |= 1;
        return C58833ax.m90834k((C57761d) cVar.build());
    }
}
