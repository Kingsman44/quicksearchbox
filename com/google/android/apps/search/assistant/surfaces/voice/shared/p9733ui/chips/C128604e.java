package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.chips;

import android.content.pm.PackageManager;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9793c.C129024a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.apps.tiktok.media.C47449e;
import com.google.common.p4526f.C59071e;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65497f;
import java.util.LinkedHashMap;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.chips.e */
/* compiled from: PG */
public final class C128604e extends C0640fb {

    /* renamed from: a */
    public static final C59071e f353590a = C59071e.m91331h();

    /* renamed from: b */
    public final C47449e f353591b;

    /* renamed from: c */
    public final PackageManager f353592c;

    /* renamed from: d */
    public final C129024a f353593d;

    /* renamed from: e */
    public final C28310af f353594e;

    /* renamed from: f */
    public final C28306ab f353595f;

    /* renamed from: g */
    public C65497f f353596g;

    /* renamed from: h */
    public final Map f353597h = new LinkedHashMap();

    public C128604e(C47449e eVar, PackageManager packageManager, C129024a aVar, C28310af afVar, C28306ab abVar) {
        C69664n.m101061g(eVar, "imageManager");
        C69664n.m101061g(packageManager, "packageManager");
        C69664n.m101061g(afVar, "visualElements");
        C69664n.m101061g(abVar, "viewVisualElements");
        this.f353591b = eVar;
        this.f353592c = packageManager;
        this.f353593d = aVar;
        this.f353594e = afVar;
        this.f353595f = abVar;
        C65497f fVar = C65497f.f178057b;
        C69664n.m101060f(fVar, "getDefaultInstance()");
        this.f353596g = fVar;
    }

    public final int getItemCount() {
        return this.f353596g.f178059a.size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(android.support.p033v7.widget.C0673gh r10, int r11) {
        /*
            r9 = this;
            com.google.android.apps.search.assistant.surfaces.voice.shared.ui.chips.c r10 = (com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.chips.C128602c) r10
            java.lang.String r0 = "holder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r0)
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.f r0 = r9.f353596g
            com.google.protobuf.cq r0 = r0.f178059a
            java.lang.Object r11 = r0.get(r11)
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.e r11 = (com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65496e) r11
            java.lang.String r0 = "chipsContents.getChips(position)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r0)
            java.lang.String r0 = "chipContent"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r0)
            int r0 = r11.f178052a
            r1 = 2
            r0 = r0 & r1
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x002b
            com.google.android.material.chip.Chip r0 = r10.f353585a
            java.lang.String r3 = r11.f178054c
            r0.setText(r3)
            goto L_0x0048
        L_0x002b:
            com.google.common.f.e r0 = f353590a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 37883(0x93fb, float:5.3085E-41)
            r3.<init>(r4)
            r0.mo56379ah(r3)
            java.lang.String r3 = "Chip doesn't have an assigned text."
            r0.mo56386p(r3)
            com.google.android.material.chip.Chip r0 = r10.f353585a
            r0.setText(r2)
        L_0x0048:
            int r0 = r11.f178052a
            r0 = r0 & 4
            r3 = 0
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0176
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.d r0 = r11.f178055d
            if (r0 != 0) goto L_0x0057
            com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.d r0 = com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65495d.f178044e
        L_0x0057:
            java.lang.String r6 = "chipContent.icon"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r6)
            int r6 = r11.f178052a
            r6 = r6 & r1
            if (r6 == 0) goto L_0x0063
            r6 = 1
            goto L_0x0064
        L_0x0063:
            r6 = 0
        L_0x0064:
            java.lang.String r7 = "chipIcon"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r7)
            int r7 = r0.f178047b
            r8 = 3
            if (r7 != r8) goto L_0x0075
            java.lang.Object r1 = r0.f178048c
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x011a
        L_0x0075:
            if (r7 != r1) goto L_0x00a4
            com.google.android.material.chip.Chip r2 = r10.f353585a
            android.content.Context r2 = r2.getContext()
            java.lang.String r3 = "chip.context"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            int r3 = r0.f178047b
            if (r3 != r1) goto L_0x008f
            java.lang.Object r1 = r0.f178048c
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0090
        L_0x008f:
            r1 = 0
        L_0x0090:
            java.lang.String r3 = "context"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r3)
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r3 = "context.packageName"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            java.lang.String r3 = com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.chips.p9739a.C128600a.m209880a(r2, r1)
            goto L_0x011a
        L_0x00a4:
            if (r7 != r5) goto L_0x011a
            boolean r1 = androidx.core.p094f.C1888a.m5150d()     // Catch:{ NameNotFoundException -> 0x00df }
            if (r1 == 0) goto L_0x00c5
            com.google.android.apps.search.assistant.surfaces.voice.shared.ui.chips.e r1 = r10.f353587c     // Catch:{ NameNotFoundException -> 0x00df }
            android.content.pm.PackageManager r1 = r1.f353592c     // Catch:{ NameNotFoundException -> 0x00df }
            int r3 = r0.f178047b     // Catch:{ NameNotFoundException -> 0x00df }
            if (r3 != r5) goto L_0x00b9
            java.lang.Object r3 = r0.f178048c     // Catch:{ NameNotFoundException -> 0x00df }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ NameNotFoundException -> 0x00df }
            goto L_0x00ba
        L_0x00b9:
            r3 = r2
        L_0x00ba:
            r7 = 0
            android.content.pm.PackageManager$ApplicationInfoFlags r7 = android.content.pm.PackageManager.ApplicationInfoFlags.of(r7)     // Catch:{ NameNotFoundException -> 0x00df }
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r3, r7)     // Catch:{ NameNotFoundException -> 0x00df }
            goto L_0x00d7
        L_0x00c5:
            com.google.android.apps.search.assistant.surfaces.voice.shared.ui.chips.e r1 = r10.f353587c     // Catch:{ NameNotFoundException -> 0x00df }
            android.content.pm.PackageManager r1 = r1.f353592c     // Catch:{ NameNotFoundException -> 0x00df }
            int r3 = r0.f178047b     // Catch:{ NameNotFoundException -> 0x00df }
            if (r3 != r5) goto L_0x00d2
            java.lang.Object r3 = r0.f178048c     // Catch:{ NameNotFoundException -> 0x00df }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ NameNotFoundException -> 0x00df }
            goto L_0x00d3
        L_0x00d2:
            r3 = r2
        L_0x00d3:
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r3, r4)     // Catch:{ NameNotFoundException -> 0x00df }
        L_0x00d7:
            java.lang.String r3 = "if (BuildCompat.isAtLeas…ckage, 0)\n              }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r3)     // Catch:{ NameNotFoundException -> 0x00df }
            int r1 = r1.icon     // Catch:{ NameNotFoundException -> 0x00df }
            goto L_0x0109
        L_0x00df:
            r1 = move-exception
            com.google.common.f.e r3 = f353590a
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            com.google.common.f.x r1 = r3.mo56382g(r1)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            int r3 = r0.f178047b
            if (r3 != r5) goto L_0x00f7
            java.lang.Object r3 = r0.f178048c
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x00f8
        L_0x00f7:
            r3 = r2
        L_0x00f8:
            com.google.common.f.n r7 = new com.google.common.f.n
            r8 = 37884(0x93fc, float:5.3087E-41)
            r7.<init>(r8)
            r1.mo56379ah(r7)
            java.lang.String r7 = "Failed to obtain ApplicationInfo for %s"
            r1.mo56389s(r7, r3)
            r1 = 0
        L_0x0109:
            int r3 = r0.f178047b
            if (r3 != r5) goto L_0x0111
            java.lang.Object r2 = r0.f178048c
            java.lang.String r2 = (java.lang.String) r2
        L_0x0111:
            java.lang.String r3 = "chipIcon.appPackage"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            java.lang.String r3 = com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.chips.p9739a.C128600a.m209880a(r2, r1)
        L_0x011a:
            if (r3 == 0) goto L_0x0198
            boolean r0 = r0.f178049d
            com.google.common.f.e r1 = f353590a
            com.google.common.f.x r2 = r1.mo56224b()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.n r7 = new com.google.common.f.n
            r8 = 37885(0x93fd, float:5.3088E-41)
            r7.<init>(r8)
            r2.mo56379ah(r7)
            java.lang.String r7 = "Loading url %s into chip icon."
            r2.mo56389s(r7, r3)
            java.lang.String r2 = r10.f353586b
            boolean r2 = p5462h.p5473f.p5475b.C69664n.m101066l(r2, r3)
            if (r2 == 0) goto L_0x0155
            com.google.common.f.x r0 = r1.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 37886(0x93fe, float:5.309E-41)
            r1.<init>(r2)
            r0.mo56379ah(r1)
            java.lang.String r1 = "Current url equal with the new chip url."
            r0.mo56386p(r1)
            goto L_0x0198
        L_0x0155:
            r10.f353586b = r3
            com.google.android.apps.search.assistant.surfaces.voice.shared.ui.chips.e r1 = r10.f353587c
            com.google.apps.tiktok.media.e r1 = r1.f353591b
            android.net.Uri r2 = android.net.Uri.parse(r3)
            com.bumptech.glide.ad r1 = r1.mo51286a()
            com.bumptech.glide.z r1 = r1.mo11870h(r2)
            com.google.android.apps.search.assistant.surfaces.voice.shared.ui.chips.b r2 = new com.google.android.apps.search.assistant.surfaces.voice.shared.ui.chips.b
            r2.<init>(r10, r6, r0)
            com.bumptech.glide.z r0 = r1.mo12439a(r2)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.mo12456t(r1, r1)
            goto L_0x0198
        L_0x0176:
            com.google.common.f.e r0 = f353590a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 37882(0x93fa, float:5.3084E-41)
            r1.<init>(r2)
            r0.mo56379ah(r1)
            java.lang.String r1 = "Chip doesn't have an assigned icon for thumbnail."
            r0.mo56386p(r1)
            com.google.android.material.chip.Chip r0 = r10.f353585a
            r0.mo47719t(r4)
            com.google.android.material.chip.Chip r0 = r10.f353585a
            r0.mo47694q(r3)
        L_0x0198:
            int r0 = r11.f178052a
            r1 = r0 & 2
            if (r1 == 0) goto L_0x01a0
            r1 = 1
            goto L_0x01a1
        L_0x01a0:
            r1 = 0
        L_0x01a1:
            r0 = r0 & 4
            if (r0 == 0) goto L_0x01a6
            r4 = 1
        L_0x01a6:
            r10.mo108548a(r1, r4)
            int r0 = r11.f178056e
            if (r0 == 0) goto L_0x01ce
            com.google.android.apps.search.assistant.surfaces.voice.shared.ui.chips.e r1 = r10.f353587c
            com.google.android.libraries.logging.ve.ab r2 = r1.f353595f
            com.google.android.material.chip.Chip r3 = r10.f353585a
            com.google.android.libraries.logging.ve.af r1 = r1.f353594e
            com.google.android.libraries.logging.ve.h r0 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r0)
            com.google.android.libraries.logging.ve.c r0 = r1.mo33805a(r0)
            java.lang.String r1 = r11.f178053b
            int r1 = r1.hashCode()
            long r4 = (long) r1
            com.google.android.libraries.logging.ve.e r1 = com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak.m53059a(r4)
            r0.mo33858f(r1)
            r2.mo33802c(r3, r0)
        L_0x01ce:
            com.google.android.material.chip.Chip r0 = r10.f353585a
            com.google.android.apps.search.assistant.surfaces.voice.shared.ui.chips.a r1 = new com.google.android.apps.search.assistant.surfaces.voice.shared.ui.chips.a
            com.google.android.apps.search.assistant.surfaces.voice.shared.ui.chips.e r2 = r10.f353587c
            r1.<init>(r11, r2, r10)
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.chips.C128604e.onBindViewHolder(android.support.v7.widget.gh, int):void");
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.assistant_regular_chip, viewGroup, false);
        C69664n.m101060f(inflate, "viewOfChip");
        return new C128602c(this, inflate);
    }
}
