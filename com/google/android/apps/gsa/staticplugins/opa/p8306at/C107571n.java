package com.google.android.apps.gsa.staticplugins.opa.p8306at;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80499b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80501d;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80502e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88092ow;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88093ox;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.chatui.MessageNotificationCarousel$MessageCarouselLayoutManager;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c.C107759j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.material.p2206b.C28505a;
import com.google.android.libraries.p11002ag.C147576f;
import com.google.android.material.p3505b.C44534d;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.assistant.p3897e.p3921j.C52641zg;
import com.google.assistant.p3897e.p3921j.C52642zh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.at.n */
/* compiled from: PG */
public final class C107571n extends C0640fb {

    /* renamed from: a */
    public static final C59071e f299268a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.at.n");

    /* renamed from: k */
    private static final int[] f299269k = {-16842910};

    /* renamed from: l */
    private static final int[] f299270l = {16842910, 16842914};

    /* renamed from: b */
    public final List f299271b;

    /* renamed from: c */
    public final C107698i f299272c;

    /* renamed from: d */
    public final C22871g f299273d;

    /* renamed from: e */
    public final C22871g f299274e;

    /* renamed from: f */
    public C28292j f299275f;

    /* renamed from: g */
    public final C86124t f299276g;

    /* renamed from: h */
    public SettableFuture f299277h;

    /* renamed from: i */
    public String f299278i;

    /* renamed from: j */
    public MessageNotificationCarousel$MessageCarouselLayoutManager f299279j;

    /* renamed from: m */
    private final Context f299280m;

    /* renamed from: n */
    private final C107759j f299281n;

    /* renamed from: o */
    private final C147576f f299282o;

    /* renamed from: p */
    private final C104149a f299283p;

    public C107571n(Context context, C107698i iVar, C107759j jVar, C22871g gVar, C22871g gVar2, C86124t tVar, C104149a aVar) {
        ContextThemeWrapper contextThemeWrapper;
        if (aVar.mo93970a()) {
            contextThemeWrapper = new ContextThemeWrapper(context, 2132149464);
            if (C44534d.m78715b()) {
                contextThemeWrapper.getTheme().applyStyle(2132150912, true);
            }
        } else if (aVar.mo93971b()) {
            contextThemeWrapper = new ContextThemeWrapper(context, 2132149466);
            if (C44534d.m78715b()) {
                contextThemeWrapper.getTheme().applyStyle(2132150627, true);
            }
        } else {
            contextThemeWrapper = new ContextThemeWrapper(context, 2132149465);
        }
        this.f299280m = contextThemeWrapper;
        this.f299272c = iVar;
        this.f299281n = jVar;
        this.f299271b = new ArrayList();
        this.f299273d = gVar;
        this.f299274e = gVar2;
        this.f299282o = C147576f.m240621c();
        this.f299276g = tVar;
        this.f299283p = aVar;
    }

    /* renamed from: c */
    public static C52236kg m178410c(String str) {
        C52235kf kfVar = C52235kf.INTERNAL;
        C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
        kdVar.copyOnWrite();
        C52236kg kgVar = (C52236kg) kdVar.instance;
        kgVar.f137092b = kfVar.f137088t;
        kgVar.f137091a |= 1;
        kdVar.copyOnWrite();
        C52236kg kgVar2 = (C52236kg) kdVar.instance;
        kgVar2.f137091a |= 2;
        kgVar2.f137093c = "Failed to send the reply message. Error message: ".concat(String.valueOf(str));
        return (C52236kg) kdVar.build();
    }

    /* renamed from: a */
    public final int mo96025a(int i) {
        for (int i2 = 0; i2 < this.f299271b.size(); i2++) {
            if (((C107572o) this.f299271b.get(i2)).mo96033g() == i) {
                return i2;
            }
        }
        C59104x d = f299268a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "MsgCarouselAdapter");
        ((C59052c) ((C59052c) d).mo56372aa(25502)).mo56387q("Cannot find the messageNotification with index %d", i);
        return -1;
    }

    /* renamed from: b */
    public final C107572o mo96026b(int i) {
        int a = mo96025a(i);
        if (a == -1) {
            return null;
        }
        return (C107572o) this.f299271b.get(a);
    }

    /* renamed from: d */
    public final void mo96027d(Button button) {
        button.setEnabled(false);
        button.setTextColor(C107579v.m178446a(this.f299280m, R.attr.message_notification_disabled_button_text_color, f299269k));
    }

    /* renamed from: e */
    public final boolean mo96028e(C107572o oVar, C107572o oVar2) {
        int lastIndexOf = this.f299271b.lastIndexOf(oVar);
        if (lastIndexOf != -1) {
            this.f299271b.remove(lastIndexOf);
            this.f299271b.add(lastIndexOf, oVar2);
            notifyItemChanged(lastIndexOf);
            return true;
        }
        C59104x d = f299268a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "MsgCarouselAdapter");
        ((C59052c) ((C59052c) d).mo56372aa(25506)).mo56386p("Cannot find the message notification card to remove");
        return false;
    }

    /* renamed from: f */
    public final void mo96029f(Button button) {
        button.setEnabled(true);
        button.setTextColor(C107579v.m178446a(this.f299280m, R.attr.message_notification_primary_action_button_text_color, f299270l));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo96030g(String str, C107570m mVar) {
        Intent launchIntentForPackage = this.f299280m.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage != null) {
            try {
                this.f299280m.startActivity(launchIntentForPackage);
            } catch (ActivityNotFoundException unused) {
                C59104x d = f299268a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "MsgCarouselAdapter");
                ((C59052c) ((C59052c) d).mo56372aa(25504)).mo56389s("Cannot find the activity for package %s", str);
                mVar.f299255k.setVisibility(8);
            }
        }
    }

    public final int getItemCount() {
        return this.f299271b.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo96031h(String str, C107570m mVar) {
        Intent launchIntentForPackage = this.f299280m.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage != null) {
            try {
                this.f299280m.startActivity(launchIntentForPackage);
            } catch (ActivityNotFoundException unused) {
                C59104x d = f299268a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "MsgCarouselAdapter");
                ((C59052c) ((C59052c) d).mo56372aa(25505)).mo56389s("Cannot find the activity for package %s", str);
                mVar.f299256l.setVisibility(8);
            }
        }
    }

    /* renamed from: i */
    public final void mo96032i(int i, int i2, C52236kg kgVar, int i3) {
        C52641zg zgVar = (C52641zg) C52642zh.f138218e.createBuilder();
        zgVar.copyOnWrite();
        C52642zh zhVar = (C52642zh) zgVar.instance;
        zhVar.f138220a |= 1;
        zhVar.f138221b = (long) i;
        zgVar.copyOnWrite();
        C52642zh zhVar2 = (C52642zh) zgVar.instance;
        zhVar2.f138222c = i2 - 1;
        zhVar2.f138220a |= 2;
        if (kgVar != null) {
            zgVar.copyOnWrite();
            C52642zh zhVar3 = (C52642zh) zgVar.instance;
            zhVar3.f138223d = kgVar;
            zhVar3.f138220a |= 4;
        }
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "message_notification.TAP";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.MessageNotificationTapParam";
        C63088z byteString = ((C52642zh) zgVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        dsVar.mo53729a("message_notification_input", (C52230ka) jzVar.build());
        C51805du duVar2 = (C51805du) dsVar.build();
        if (i3 == 0) {
            throw null;
        } else if (i3 != 2 || !this.f299276g.mo79746e(C90126fx.f251428id)) {
            C88093ox oxVar = (C88093ox) C88094oy.f238174g.createBuilder();
            C63088z byteString2 = duVar2.toByteString();
            oxVar.copyOnWrite();
            C88094oy oyVar = (C88094oy) oxVar.instance;
            byteString2.getClass();
            oyVar.f238176a |= 1;
            oyVar.f238177b = byteString2;
            C88489j jVar = new C88489j(C87739bu.OPA_CLIENT_INPUT);
            jVar.mo82014b(C88092ow.f238173a, (C88094oy) oxVar.build());
            this.f299272c.mo96219b(jVar.mo82013a());
        } else {
            C107759j jVar2 = this.f299281n;
            C80499b bVar = (C80499b) C80502e.f220990d.createBuilder();
            C80501d dVar = C80501d.MESSAGE_NOTIFICATION;
            bVar.copyOnWrite();
            C80502e eVar = (C80502e) bVar.instance;
            eVar.f220994c = dVar.f220989h;
            eVar.f220992a |= 4;
            jVar2.mo96268d(duVar2, (C80502e) bVar.build());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v21, resolved type: android.widget.ImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v22, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v33, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v34, resolved type: android.widget.TextView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onBindViewHolder(android.support.p033v7.widget.C0673gh r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r18
            com.google.android.apps.gsa.staticplugins.opa.at.m r2 = (com.google.android.apps.gsa.staticplugins.opa.p8306at.C107570m) r2
            com.google.android.apps.gsa.staticplugins.opa.chatui.MessageNotificationCarousel$MessageCarouselLayoutManager r3 = r0.f299279j
            r4 = 1
            if (r3 == 0) goto L_0x000f
            r3.f300894b = r4
        L_0x000f:
            java.util.List r3 = r0.f299271b
            int r3 = r3.size()
            int r3 = r3 + -1
            r5 = 0
            if (r1 != r3) goto L_0x002d
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            android.widget.RelativeLayout r6 = r2.f299246b
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            r3.<init>(r6)
            r3.setMargins(r5, r5, r5, r5)
            android.widget.RelativeLayout r6 = r2.f299246b
            r6.setLayoutParams(r3)
        L_0x002d:
            java.util.List r3 = r0.f299271b
            java.lang.Object r1 = r3.get(r1)
            com.google.android.apps.gsa.staticplugins.opa.at.o r1 = (com.google.android.apps.gsa.staticplugins.opa.p8306at.C107572o) r1
            int r3 = r1.f299290h
            r2.f299245a = r1
            boolean r6 = r1 instanceof com.google.android.apps.gsa.staticplugins.opa.p8306at.C107561d
            if (r6 == 0) goto L_0x0060
            android.widget.RelativeLayout r7 = r2.f299246b
            android.content.Context r8 = r0.f299280m
            android.content.res.Resources r8 = r8.getResources()
            android.content.Context r9 = r0.f299280m
            android.content.res.Resources$Theme r9 = r9.getTheme()
            r10 = 2131233331(0x7f080a33, float:1.8082796E38)
            android.graphics.drawable.Drawable r8 = r8.getDrawable(r10, r9)
            r7.setBackground(r8)
            android.widget.RelativeLayout r7 = r2.f299246b
            com.google.android.apps.gsa.staticplugins.opa.at.e r8 = new com.google.android.apps.gsa.staticplugins.opa.at.e
            r8.<init>(r0, r1, r3)
            r7.setOnClickListener(r8)
            goto L_0x007d
        L_0x0060:
            android.widget.RelativeLayout r7 = r2.f299246b
            android.content.Context r8 = r0.f299280m
            android.content.res.Resources r8 = r8.getResources()
            android.content.Context r9 = r0.f299280m
            android.content.res.Resources$Theme r9 = r9.getTheme()
            r10 = 2131233334(0x7f080a36, float:1.8082803E38)
            android.graphics.drawable.Drawable r8 = r8.getDrawable(r10, r9)
            r7.setBackground(r8)
            android.widget.RelativeLayout r7 = r2.f299246b
            r7.setClickable(r5)
        L_0x007d:
            r7 = 8
            com.google.android.apps.gsa.staticplugins.opa.as.b.a.n r8 = r1.f299285c     // Catch:{ NameNotFoundException -> 0x00f5 }
            java.lang.String r8 = r8.f299178d     // Catch:{ NameNotFoundException -> 0x00f5 }
            android.content.Context r9 = r0.f299280m     // Catch:{ NameNotFoundException -> 0x00f5 }
            android.content.pm.PackageManager r9 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00f5 }
            android.graphics.drawable.Drawable r9 = r9.getApplicationIcon(r8)     // Catch:{ NameNotFoundException -> 0x00f5 }
            android.content.Context r10 = r0.f299280m     // Catch:{ NameNotFoundException -> 0x00f5 }
            android.content.pm.PackageManager r10 = r10.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00f5 }
            android.content.pm.ApplicationInfo r10 = r10.getApplicationInfo(r8, r5)     // Catch:{ NameNotFoundException -> 0x00f5 }
            android.content.Context r11 = r0.f299280m     // Catch:{ NameNotFoundException -> 0x00f5 }
            android.content.pm.PackageManager r11 = r11.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00f5 }
            java.lang.CharSequence r10 = r11.getApplicationLabel(r10)     // Catch:{ NameNotFoundException -> 0x00f5 }
            java.lang.String r10 = r10.toString()     // Catch:{ NameNotFoundException -> 0x00f5 }
            boolean r11 = r1.mo96040n()     // Catch:{ NameNotFoundException -> 0x00f5 }
            if (r11 != 0) goto L_0x00c5
            android.widget.ImageButton r10 = r2.f299255k     // Catch:{ NameNotFoundException -> 0x00f5 }
            r10.setVisibility(r5)     // Catch:{ NameNotFoundException -> 0x00f5 }
            android.widget.ImageButton r10 = r2.f299255k     // Catch:{ NameNotFoundException -> 0x00f5 }
            r10.setImageDrawable(r9)     // Catch:{ NameNotFoundException -> 0x00f5 }
            android.widget.ImageButton r9 = r2.f299255k     // Catch:{ NameNotFoundException -> 0x00f5 }
            com.google.android.apps.gsa.staticplugins.opa.at.f r10 = new com.google.android.apps.gsa.staticplugins.opa.at.f     // Catch:{ NameNotFoundException -> 0x00f5 }
            r10.<init>(r0, r8, r2)     // Catch:{ NameNotFoundException -> 0x00f5 }
            r9.setOnClickListener(r10)     // Catch:{ NameNotFoundException -> 0x00f5 }
            android.widget.LinearLayout r8 = r2.f299256l     // Catch:{ NameNotFoundException -> 0x00f5 }
            r8.setVisibility(r7)     // Catch:{ NameNotFoundException -> 0x00f5 }
            goto L_0x00ff
        L_0x00c5:
            android.widget.LinearLayout r11 = r2.f299256l     // Catch:{ NameNotFoundException -> 0x00f5 }
            r11.setVisibility(r5)     // Catch:{ NameNotFoundException -> 0x00f5 }
            android.widget.ImageButton r11 = r2.f299257m     // Catch:{ NameNotFoundException -> 0x00f5 }
            r11.setImageDrawable(r9)     // Catch:{ NameNotFoundException -> 0x00f5 }
            android.widget.TextView r9 = r2.f299258n     // Catch:{ NameNotFoundException -> 0x00f5 }
            android.content.Context r11 = r0.f299280m     // Catch:{ NameNotFoundException -> 0x00f5 }
            android.content.res.Resources r11 = r11.getResources()     // Catch:{ NameNotFoundException -> 0x00f5 }
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ NameNotFoundException -> 0x00f5 }
            r12[r5] = r10     // Catch:{ NameNotFoundException -> 0x00f5 }
            r10 = 2132091816(0x7f1523a8, float:1.982401E38)
            java.lang.String r10 = r11.getString(r10, r12)     // Catch:{ NameNotFoundException -> 0x00f5 }
            r9.setText(r10)     // Catch:{ NameNotFoundException -> 0x00f5 }
            android.widget.LinearLayout r9 = r2.f299256l     // Catch:{ NameNotFoundException -> 0x00f5 }
            com.google.android.apps.gsa.staticplugins.opa.at.g r10 = new com.google.android.apps.gsa.staticplugins.opa.at.g     // Catch:{ NameNotFoundException -> 0x00f5 }
            r10.<init>(r0, r8, r2)     // Catch:{ NameNotFoundException -> 0x00f5 }
            r9.setOnClickListener(r10)     // Catch:{ NameNotFoundException -> 0x00f5 }
            android.widget.ImageButton r8 = r2.f299255k     // Catch:{ NameNotFoundException -> 0x00f5 }
            r8.setVisibility(r7)     // Catch:{ NameNotFoundException -> 0x00f5 }
            goto L_0x00ff
        L_0x00f5:
            android.widget.ImageButton r8 = r2.f299255k
            r8.setVisibility(r7)
            android.widget.LinearLayout r8 = r2.f299256l
            r8.setVisibility(r7)
        L_0x00ff:
            boolean r8 = r1.mo96036j()
            if (r8 == 0) goto L_0x010a
            java.lang.String r8 = r1.mo96034h()
            goto L_0x010e
        L_0x010a:
            java.lang.String r8 = r1.mo96035i()
        L_0x010e:
            boolean r9 = r1.mo96038l()
            r10 = 0
            if (r9 == 0) goto L_0x0182
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x0182
            android.widget.LinearLayout r9 = r2.f299259o
            r9.removeAllViews()
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x0128
            r9 = r10
            goto L_0x016b
        L_0x0128:
            com.google.android.libraries.ag.f r9 = r0.f299282o     // Catch:{ e -> 0x0151 }
            java.util.Locale r11 = java.util.Locale.getDefault()     // Catch:{ e -> 0x0151 }
            java.lang.String r11 = r11.getCountry()     // Catch:{ e -> 0x0151 }
            r9.mo124320f(r8, r11)     // Catch:{ e -> 0x0151 }
            android.content.Context r9 = r0.f299280m
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            r11 = 2131625959(0x7f0e07e7, float:1.887914E38)
            android.view.View r9 = r9.inflate(r11, r10)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            android.content.Context r11 = r0.f299280m
            r12 = 2131233860(0x7f080c44, float:1.808387E38)
            android.graphics.drawable.Drawable r11 = r11.getDrawable(r12)
            r9.setImageDrawable(r11)
            goto L_0x016b
        L_0x0151:
            android.content.Context r9 = r0.f299280m
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            r11 = 2131625960(0x7f0e07e8, float:1.8879143E38)
            android.view.View r9 = r9.inflate(r11, r10)
            android.widget.TextView r9 = (android.widget.TextView) r9
            char r11 = r8.charAt(r5)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r9.setText(r11)
        L_0x016b:
            if (r9 == 0) goto L_0x0172
            android.widget.LinearLayout r11 = r2.f299259o
            r11.addView(r9)
        L_0x0172:
            android.widget.LinearLayout r9 = r2.f299259o
            r9.setVisibility(r5)
            android.widget.TextView r9 = r2.f299260p
            r9.setText(r8)
            android.widget.TextView r8 = r2.f299260p
            r8.setVisibility(r5)
            goto L_0x018c
        L_0x0182:
            android.widget.LinearLayout r8 = r2.f299259o
            r8.setVisibility(r7)
            android.widget.TextView r8 = r2.f299260p
            r8.setVisibility(r7)
        L_0x018c:
            if (r6 == 0) goto L_0x034e
            boolean r6 = r1.mo96014e()
            if (r6 == 0) goto L_0x034e
            android.widget.LinearLayout r6 = r2.f299250f
            r6.removeAllViews()
            r6 = r1
            com.google.android.apps.gsa.staticplugins.opa.at.d r6 = (com.google.android.apps.gsa.staticplugins.opa.p8306at.C107561d) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            com.google.common.b.fx r9 = new com.google.common.b.fx
            r9.<init>()
            com.google.android.apps.gsa.staticplugins.opa.as.b.a.n r11 = r6.f299285c
            com.google.protobuf.cq r11 = r11.f299179e
            java.util.Iterator r11 = r11.iterator()
        L_0x01ae:
            boolean r12 = r11.hasNext()
            java.lang.String r13 = "audio"
            java.lang.String r14 = "video"
            java.lang.String r15 = "image"
            if (r12 == 0) goto L_0x01d8
            java.lang.Object r12 = r11.next()
            com.google.android.apps.gsa.staticplugins.opa.as.b.a.m r12 = (com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107534m) r12
            java.lang.String r12 = r12.f299172c
            boolean r15 = r12.equals(r15)
            if (r15 != 0) goto L_0x01d4
            boolean r14 = r12.equals(r14)
            if (r14 != 0) goto L_0x01d4
            boolean r13 = r12.equals(r13)
            if (r13 == 0) goto L_0x01ae
        L_0x01d4:
            r9.mo54931lF(r12, r4)
            goto L_0x01ae
        L_0x01d8:
            com.google.common.b.oz r11 = r9.f155881a
            int r11 = r11.mo55793b(r15)
            if (r11 == 0) goto L_0x0219
            com.google.common.b.oz r11 = r9.f155881a
            int r11 = r11.mo55793b(r15)
            android.content.Context r15 = r0.f299280m
            android.view.LayoutInflater r15 = android.view.LayoutInflater.from(r15)
            r7 = 2131625954(0x7f0e07e2, float:1.887913E38)
            android.view.View r7 = r15.inflate(r7, r10)
            r15 = 2131434527(0x7f0b1c1f, float:1.849087E38)
            android.view.View r15 = r7.findViewById(r15)
            android.widget.TextView r15 = (android.widget.TextView) r15
            android.content.Context r12 = r0.f299280m
            android.content.res.Resources r12 = r12.getResources()
            java.lang.Object[] r10 = new java.lang.Object[r4]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r11)
            r10[r5] = r16
            r5 = 2131951706(0x7f13005a, float:1.9539834E38)
            java.lang.String r5 = r12.getQuantityString(r5, r11, r10)
            r15.setText(r5)
            r8.add(r7)
            r5 = 5
            goto L_0x021a
        L_0x0219:
            r5 = 6
        L_0x021a:
            com.google.common.b.oz r7 = r9.f155881a
            int r7 = r7.mo55793b(r14)
            if (r7 == 0) goto L_0x025e
            com.google.common.b.oz r7 = r9.f155881a
            int r7 = r7.mo55793b(r14)
            android.content.Context r10 = r0.f299280m
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            r11 = 2131625967(0x7f0e07ef, float:1.8879157E38)
            r12 = 0
            android.view.View r10 = r10.inflate(r11, r12)
            r11 = 2131436912(0x7f0b2570, float:1.8495708E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            android.content.Context r12 = r0.f299280m
            android.content.res.Resources r12 = r12.getResources()
            java.lang.Object[] r14 = new java.lang.Object[r4]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r7)
            r16 = 0
            r14[r16] = r15
            r15 = 2131951707(0x7f13005b, float:1.9539836E38)
            java.lang.String r7 = r12.getQuantityString(r15, r7, r14)
            r11.setText(r7)
            r8.add(r10)
            int r5 = r5 + -1
        L_0x025e:
            com.google.common.b.oz r7 = r9.f155881a
            int r7 = r7.mo55793b(r13)
            if (r7 == 0) goto L_0x02a1
            com.google.common.b.oz r7 = r9.f155881a
            int r7 = r7.mo55793b(r13)
            android.content.Context r9 = r0.f299280m
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            r10 = 2131625932(0x7f0e07cc, float:1.8879086E38)
            r11 = 0
            android.view.View r9 = r9.inflate(r10, r11)
            r10 = 2131429188(0x7f0b0744, float:1.8480042E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            android.content.Context r11 = r0.f299280m
            android.content.res.Resources r11 = r11.getResources()
            java.lang.Object[] r12 = new java.lang.Object[r4]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            r14 = 0
            r12[r14] = r13
            r13 = 2131951705(0x7f130059, float:1.9539832E38)
            java.lang.String r7 = r11.getQuantityString(r13, r7, r12)
            r10.setText(r7)
            r8.add(r9)
            int r5 = r5 + -1
        L_0x02a1:
            r7 = 6
            if (r5 == r7) goto L_0x02a6
            int r5 = r5 + -1
        L_0x02a6:
            java.lang.String r7 = r6.mo96013d()
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x02d3
            java.lang.String r6 = r6.mo96013d()
            android.content.Context r7 = r0.f299280m
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r9 = 2131625963(0x7f0e07eb, float:1.8879149E38)
            r10 = 0
            android.view.View r7 = r7.inflate(r9, r10)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r7.setText(r6)
            r7.setMaxLines(r5)
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.END
            r7.setEllipsize(r5)
            r5 = 0
            r8.add(r5, r7)
        L_0x02d3:
            java.util.Iterator r5 = r8.iterator()
        L_0x02d7:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x02e9
            java.lang.Object r6 = r5.next()
            android.view.View r6 = (android.view.View) r6
            android.widget.LinearLayout r7 = r2.f299250f
            r7.addView(r6)
            goto L_0x02d7
        L_0x02e9:
            android.widget.LinearLayout r5 = r2.f299250f
            r6 = 0
            r5.setVisibility(r6)
            android.widget.LinearLayout r5 = r2.f299263s
            r5.setVisibility(r6)
            com.google.android.apps.gsa.search.core.i.t r5 = r0.f299276g
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247266ds
            boolean r5 = r5.mo79746e(r7)
            if (r5 != 0) goto L_0x031e
            boolean r5 = r1.mo96036j()
            if (r5 == 0) goto L_0x031e
            android.widget.TextView r5 = r2.f299261q
            r5.setVisibility(r6)
            android.widget.TextView r5 = r2.f299261q
            java.lang.String r7 = r1.mo96035i()
            r5.setText(r7)
            android.widget.TextView r5 = r2.f299262r
            r5.setVisibility(r6)
            android.widget.TextView r5 = r2.f299262r
            java.lang.String r6 = "  •  "
            r5.setText(r6)
        L_0x031e:
            android.widget.TextView r5 = r2.f299251g
            com.google.android.apps.gsa.staticplugins.opa.as.b.a.n r6 = r1.f299285c
            com.google.assistant.e.j.aco r6 = r6.f299176b
            if (r6 != 0) goto L_0x0328
            com.google.assistant.e.j.aco r6 = com.google.assistant.p3897e.p3921j.aco.f134821t
        L_0x0328:
            long r6 = r6.f134829g
            long r8 = java.lang.System.currentTimeMillis()
            boolean r8 = com.google.android.apps.gsa.shared.util.C90769bm.m148270b(r6, r8)
            if (r8 == 0) goto L_0x033b
            android.content.Context r8 = r0.f299280m
            java.lang.String r6 = android.text.format.DateUtils.formatDateTime(r8, r6, r4)
            goto L_0x0344
        L_0x033b:
            android.content.Context r8 = r0.f299280m
            r9 = 98327(0x18017, float:1.37785E-40)
            java.lang.String r6 = android.text.format.DateUtils.formatDateTime(r8, r6, r9)
        L_0x0344:
            r5.setText(r6)
            android.widget.TextView r5 = r2.f299251g
            r6 = 0
            r5.setVisibility(r6)
            goto L_0x035a
        L_0x034e:
            android.widget.LinearLayout r5 = r2.f299250f
            r6 = 8
            r5.setVisibility(r6)
            android.widget.LinearLayout r5 = r2.f299263s
            r5.setVisibility(r6)
        L_0x035a:
            boolean r5 = r1.mo96012c()
            if (r5 == 0) goto L_0x0393
            com.google.android.material.textfield.TextInputLayout r5 = r2.f299264t
            r6 = 0
            r5.setVisibility(r6)
            com.google.android.material.textfield.TextInputLayout r5 = r2.f299264t
            android.content.Context r7 = r0.f299280m
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131170200(0x7f071398, float:1.7954752E38)
            int r7 = r7.getDimensionPixelSize(r8)
            r5.setMinimumHeight(r7)
            com.google.android.material.textfield.TextInputEditText r5 = r2.f299265u
            r5.setVisibility(r6)
            com.google.android.material.textfield.TextInputEditText r5 = r2.f299265u
            java.lang.String r6 = r1.mo96010a()
            r5.setText(r6)
            com.google.android.material.textfield.TextInputEditText r5 = r2.f299265u
            com.google.android.apps.gsa.staticplugins.opa.at.k r6 = new com.google.android.apps.gsa.staticplugins.opa.at.k
            r6.<init>(r0, r1, r2)
            r5.addTextChangedListener(r6)
            r6 = 8
            goto L_0x039f
        L_0x0393:
            com.google.android.material.textfield.TextInputLayout r5 = r2.f299264t
            r6 = 8
            r5.setVisibility(r6)
            com.google.android.material.textfield.TextInputEditText r5 = r2.f299265u
            r5.setVisibility(r6)
        L_0x039f:
            boolean r5 = r1.mo96037k()
            if (r5 == 0) goto L_0x03b5
            android.widget.TextView r5 = r2.f299266v
            r7 = 0
            r5.setVisibility(r7)
            android.widget.TextView r5 = r2.f299266v
            java.lang.String r7 = r1.mo96010a()
            r5.setText(r7)
            goto L_0x03ba
        L_0x03b5:
            android.widget.TextView r5 = r2.f299266v
            r5.setVisibility(r6)
        L_0x03ba:
            boolean r5 = r1.mo96039m()
            if (r5 == 0) goto L_0x03ec
            android.widget.TextView r5 = r2.f299267w
            android.content.Context r6 = r0.f299280m
            android.content.res.Resources r6 = r6.getResources()
            java.lang.Object[] r4 = new java.lang.Object[r4]
            boolean r7 = r1.mo96036j()
            if (r7 == 0) goto L_0x03d5
            java.lang.String r7 = r1.mo96034h()
            goto L_0x03d9
        L_0x03d5:
            java.lang.String r7 = r1.mo96035i()
        L_0x03d9:
            r8 = 0
            r4[r8] = r7
            r7 = 2132091822(0x7f1523ae, float:1.9824023E38)
            java.lang.String r4 = r6.getString(r7, r4)
            r5.setText(r4)
            android.widget.TextView r4 = r2.f299267w
            r4.setVisibility(r8)
            goto L_0x03f4
        L_0x03ec:
            r8 = 0
            android.widget.TextView r4 = r2.f299267w
            r5 = 8
            r4.setVisibility(r5)
        L_0x03f4:
            boolean r4 = r1.mo96015f()
            if (r4 == 0) goto L_0x040f
            android.widget.Button r4 = r2.f299252h
            r4.setVisibility(r8)
            android.widget.Button r4 = r2.f299252h
            r0.mo96029f(r4)
            android.widget.Button r4 = r2.f299252h
            com.google.android.apps.gsa.staticplugins.opa.at.h r5 = new com.google.android.apps.gsa.staticplugins.opa.at.h
            r5.<init>(r0, r2, r1, r3)
            r4.setOnClickListener(r5)
            goto L_0x0416
        L_0x040f:
            android.widget.Button r4 = r2.f299252h
            r5 = 8
            r4.setVisibility(r5)
        L_0x0416:
            boolean r4 = r1.mo96011b()
            if (r4 == 0) goto L_0x0451
            android.widget.Button r4 = r2.f299253i
            r5 = 0
            r4.setVisibility(r5)
            android.widget.Button r4 = r2.f299253i
            com.google.android.apps.gsa.staticplugins.opa.at.i r6 = new com.google.android.apps.gsa.staticplugins.opa.at.i
            r6.<init>(r0, r1, r3)
            r4.setOnClickListener(r6)
            android.widget.Button r4 = r2.f299254j
            r4.setVisibility(r5)
            java.lang.String r4 = r1.mo96010a()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0441
            android.widget.Button r4 = r2.f299254j
            r0.mo96029f(r4)
            goto L_0x0446
        L_0x0441:
            android.widget.Button r4 = r2.f299254j
            r0.mo96027d(r4)
        L_0x0446:
            android.widget.Button r4 = r2.f299254j
            com.google.android.apps.gsa.staticplugins.opa.at.j r5 = new com.google.android.apps.gsa.staticplugins.opa.at.j
            r5.<init>(r0, r2, r1, r3)
            r4.setOnClickListener(r5)
            return
        L_0x0451:
            android.widget.Button r1 = r2.f299253i
            r3 = 8
            r1.setVisibility(r3)
            android.widget.Button r1 = r2.f299254j
            r1.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8306at.C107571n.onBindViewHolder(android.support.v7.widget.gh, int):void");
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        Drawable background;
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(this.f299280m).inflate(R.layout.message_notification_card_view, viewGroup, false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Math.min(this.f299280m.getResources().getDimensionPixelSize(R.dimen.message_notification_card_width), (viewGroup.getWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight()), -2);
        layoutParams.setMargins(0, 0, this.f299280m.getResources().getDimensionPixelSize(R.dimen.message_notification_card_margin_right), 0);
        relativeLayout.setLayoutParams(layoutParams);
        if (this.f299283p.mo93970a() && (background = relativeLayout.getBackground()) != null) {
            background.setTint(C28505a.m53283a(R.dimen.gm3_sys_elevation_level2, this.f299280m));
        }
        return new C107570m(relativeLayout);
    }

    public final /* synthetic */ void onViewRecycled(C0673gh ghVar) {
        ((C107570m) ghVar).f299245a = null;
    }
}
