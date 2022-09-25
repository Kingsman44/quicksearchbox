package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.slice.C4110i;
import androidx.slice.C4113l;
import androidx.slice.C4114m;
import androidx.slice.C4121t;
import androidx.slice.Slice;
import androidx.slice.widget.SliceView;
import com.google.android.apps.gsa.assistant.shared.p5816g.C73867g;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90019by;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.slices.AssistantSliceView;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* compiled from: PG */
public class OpaAppActionsSliceCard extends LinearLayout implements C73867g {

    /* renamed from: a */
    public static final C59071e f300899a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.chatui.OpaAppActionsSliceCard");

    /* renamed from: b */
    public C68214a f300900b;

    /* renamed from: c */
    public String f300901c;

    /* renamed from: d */
    public final C4114m f300902d;

    /* renamed from: e */
    public Slice f300903e;

    /* renamed from: f */
    public C4113l f300904f;

    /* renamed from: g */
    public Uri f300905g;

    /* renamed from: h */
    public boolean f300906h = false;

    /* renamed from: i */
    private final Context f300907i;

    /* renamed from: j */
    private SliceView f300908j;

    /* renamed from: k */
    private AssistantSliceView f300909k;

    /* renamed from: l */
    private int f300910l;

    /* renamed from: m */
    private TextView f300911m;

    /* renamed from: n */
    private C60870cx f300912n;

    /* renamed from: o */
    private boolean f300913o = false;

    /* renamed from: p */
    private boolean f300914p = false;

    /* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.OpaAppActionsSliceCard$a */
    /* compiled from: PG */
    public interface C108188a {
        /* renamed from: qE */
        void mo96558qE(OpaAppActionsSliceCard opaAppActionsSliceCard);
    }

    public OpaAppActionsSliceCard(Context context) {
        super(context);
        this.f300907i = context;
        this.f300902d = new C4121t(context);
        this.f300910l = 2;
    }

    /* renamed from: d */
    static /* synthetic */ void m179599d(PendingIntent pendingIntent) {
        try {
            pendingIntent.send();
        } catch (PendingIntent.CanceledException e) {
            ((C59052c) ((C59052c) ((C59052c) f300899a.mo56225c()).mo56382g(e)).mo56372aa(24016)).mo56386p("PendingIntent primary action was cancelled");
        }
    }

    /* renamed from: e */
    private final synchronized void m179600e(Slice slice, C89859i iVar) {
        if (!this.f300914p) {
            C4110i iVar2 = new C4110i(this.f300907i, slice);
            if (iVar2.mo8620i()) {
                iVar.mo83702b(C89849ae.APP_ACTIONS_SLICE_END_ERROR);
                this.f300914p = true;
            } else if (iVar2.mo8622k()) {
                iVar.mo83702b(C89849ae.APP_ACTIONS_SLICE_END_PERMISSION);
                this.f300914p = true;
            } else {
                if (iVar2.mo8612a() != 2) {
                    if (!this.f300913o) {
                        iVar.mo83702b(C89849ae.APP_ACTIONS_SLICE_INTERMEDIATE_LOAD);
                        this.f300913o = true;
                        return;
                    }
                }
                if (iVar2.mo8612a() == 2) {
                    iVar.mo83702b(C89849ae.APP_ACTIONS_SLICE_END_SUCCESS);
                    this.f300914p = true;
                }
            }
        }
    }

    /* renamed from: a */
    public final C60870cx mo65343a(C90931ca caVar) {
        return caVar.mo85140e(this.f300912n, new C108352fn(this));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96554b(androidx.slice.Slice r13, com.google.android.apps.gsa.shared.logger.p7051b.C89859i r14, com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i r15) {
        /*
            r12 = this;
            if (r13 != 0) goto L_0x0003
            return
        L_0x0003:
            dagger.a r0 = r12.f300900b
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90019by.f248080n
            boolean r0 = r0.mo79746e(r1)
            r1 = 0
            r2 = 2
            if (r0 == 0) goto L_0x001b
            com.google.android.libraries.assistant.slices.AssistantSliceView r0 = r12.f300909k
            r0.mo8671f(r13)
            goto L_0x004d
        L_0x001b:
            androidx.slice.widget.SliceView r0 = r12.f300908j
            r0.mo8671f(r13)
            android.content.Context r0 = r12.f300907i
            androidx.slice.i r3 = new androidx.slice.i
            r3.<init>(r0, r13)
            r0 = 2131435965(0x7f0b21bd, float:1.8493787E38)
            android.view.View r0 = r12.findViewById(r0)
            int r4 = r0.getVisibility()
            if (r4 == 0) goto L_0x004d
            int r4 = r3.mo8612a()
            if (r4 != r2) goto L_0x004d
            androidx.slice.a.a r3 = r3.f13140f
            if (r3 == 0) goto L_0x004d
            android.app.PendingIntent r3 = r3.mo8605b()
            com.google.android.apps.gsa.staticplugins.opa.chatui.fm r4 = new com.google.android.apps.gsa.staticplugins.opa.chatui.fm
            r4.<init>(r3)
            r0.setOnClickListener(r4)
            r0.setVisibility(r1)
        L_0x004d:
            android.content.Context r0 = r12.f300907i
            androidx.slice.i r3 = new androidx.slice.i
            r3.<init>(r0, r13)
            android.os.Bundle r0 = r3.f13139e
            java.lang.String r3 = "assistantTts"
            java.lang.String r4 = r0.getString(r3)
            if (r4 == 0) goto L_0x006f
            android.widget.TextView r4 = r12.f300911m
            r4.setVisibility(r1)
            android.widget.TextView r4 = r12.f300911m
            java.lang.String r0 = r0.getString(r3)
            r0.getClass()
            r4.setText(r0)
        L_0x006f:
            android.content.Context r0 = r12.f300907i
            androidx.slice.i r4 = new androidx.slice.i
            r4.<init>(r0, r13)
            android.os.Bundle r0 = r4.f13139e
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0080
            goto L_0x021c
        L_0x0080:
            com.google.assistant.e.j.akj r4 = com.google.assistant.p3897e.p3921j.akj.f135267f
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.j.akf r4 = (com.google.assistant.p3897e.p3921j.akf) r4
            java.lang.String r5 = r0.getString(r3)
            r6 = 1
            if (r5 == 0) goto L_0x00a4
            java.lang.String r3 = r0.getString(r3)
            r3.getClass()
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.e.j.akj r5 = (com.google.assistant.p3897e.p3921j.akj) r5
            int r7 = r5.f135269a
            r7 = r7 | r6
            r5.f135269a = r7
            r5.f135270b = r3
        L_0x00a4:
            java.lang.String r3 = "assistantTtsSsml"
            java.lang.String r5 = r0.getString(r3)
            if (r5 == 0) goto L_0x00c1
            java.lang.String r3 = r0.getString(r3)
            r3.getClass()
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.e.j.akj r5 = (com.google.assistant.p3897e.p3921j.akj) r5
            int r7 = r5.f135269a
            r7 = r7 | r2
            r5.f135269a = r7
            r5.f135271c = r3
        L_0x00c1:
            java.lang.String r3 = "assistantTtsLang"
            java.lang.String r5 = r0.getString(r3)
            r7 = 4
            if (r5 == 0) goto L_0x00df
            java.lang.String r3 = r0.getString(r3)
            r3.getClass()
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.e.j.akj r5 = (com.google.assistant.p3897e.p3921j.akj) r5
            int r8 = r5.f135269a
            r8 = r8 | r7
            r5.f135269a = r8
            r5.f135272d = r3
        L_0x00df:
            java.lang.String r3 = "assistantDialogFieldStates"
            java.lang.String[] r5 = r0.getStringArray(r3)
            if (r5 == 0) goto L_0x018a
            java.lang.String[] r0 = r0.getStringArray(r3)
            r0.getClass()
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
            int r3 = r0.size()
            int r3 = r3 % r2
            if (r3 != 0) goto L_0x018a
            java.util.List r0 = com.google.common.p4522b.C58597ky.m90215f(r0, r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0103:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x018a
            java.lang.Object r3 = r0.next()
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r5 = r3.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            int r8 = r5.hashCode()
            r9 = -1
            r10 = 3
            switch(r8) {
                case -1422950650: goto L_0x013d;
                case -995582717: goto L_0x0133;
                case -840170026: goto L_0x0129;
                case -599445191: goto L_0x011f;
                default: goto L_0x011e;
            }
        L_0x011e:
            goto L_0x0147
        L_0x011f:
            java.lang.String r8 = "complete"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x0147
            r5 = 2
            goto L_0x0148
        L_0x0129:
            java.lang.String r8 = "unused"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x0147
            r5 = 3
            goto L_0x0148
        L_0x0133:
            java.lang.String r8 = "prompted"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x0147
            r5 = 1
            goto L_0x0148
        L_0x013d:
            java.lang.String r8 = "active"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x0147
            r5 = 0
            goto L_0x0148
        L_0x0147:
            r5 = -1
        L_0x0148:
            if (r5 == 0) goto L_0x0156
            if (r5 == r6) goto L_0x0157
            if (r5 == r2) goto L_0x0154
            if (r5 == r10) goto L_0x0152
            r10 = 1
            goto L_0x0157
        L_0x0152:
            r10 = 5
            goto L_0x0157
        L_0x0154:
            r10 = 4
            goto L_0x0157
        L_0x0156:
            r10 = 2
        L_0x0157:
            com.google.assistant.e.j.aki r5 = com.google.assistant.p3897e.p3921j.aki.f135262d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.e.j.akg r5 = (com.google.assistant.p3897e.p3921j.akg) r5
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.assistant.e.j.aki r8 = (com.google.assistant.p3897e.p3921j.aki) r8
            r3.getClass()
            int r11 = r8.f135264a
            r11 = r11 | r6
            r8.f135264a = r11
            r8.f135265b = r3
            r5.copyOnWrite()
            com.google.protobuf.bv r3 = r5.instance
            com.google.assistant.e.j.aki r3 = (com.google.assistant.p3897e.p3921j.aki) r3
            int r10 = r10 + r9
            r3.f135266c = r10
            int r8 = r3.f135264a
            r8 = r8 | r2
            r3.f135264a = r8
            r4.mo53690a(r5)
            goto L_0x0103
        L_0x018a:
            com.google.assistant.e.j.du r0 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.ds r0 = (com.google.assistant.p3897e.p3921j.C51803ds) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.e.j.du r1 = (com.google.assistant.p3897e.p3921j.C51805du) r1
            int r3 = r1.f135926a
            r3 = r3 | r6
            r1.f135926a = r3
            java.lang.String r3 = "slice.DIALOG_INFO"
            r1.f135927b = r3
            com.google.assistant.e.j.ka r1 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.jz r1 = (com.google.assistant.p3897e.p3921j.C52228jz) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.e.j.ka r3 = (com.google.assistant.p3897e.p3921j.C52230ka) r3
            int r5 = r3.f137059a
            r5 = r5 | r6
            r3.f137059a = r5
            java.lang.String r5 = "assistant.api.client_input.SliceDialogInfoInput"
            r3.f137060b = r5
            com.google.protobuf.bv r3 = r4.build()
            com.google.assistant.e.j.akj r3 = (com.google.assistant.p3897e.p3921j.akj) r3
            com.google.protobuf.z r3 = r3.toByteString()
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.assistant.e.j.ka r4 = (com.google.assistant.p3897e.p3921j.C52230ka) r4
            r3.getClass()
            int r5 = r4.f137059a
            r2 = r2 | r5
            r4.f137059a = r2
            r4.f137061c = r3
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.ka r1 = (com.google.assistant.p3897e.p3921j.C52230ka) r1
            java.lang.String r2 = "slice_dialog_info_input"
            r0.mo53729a(r2, r1)
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.du r0 = (com.google.assistant.p3897e.p3921j.C51805du) r0
            com.google.android.apps.gsa.search.shared.service.b.oy r1 = com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy.f238174g
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.ox r1 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88093ox) r1
            com.google.protobuf.z r0 = r0.toByteString()
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.gsa.search.shared.service.b.oy r2 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy) r2
            r0.getClass()
            int r3 = r2.f238176a
            r3 = r3 | r6
            r2.f238176a = r3
            r2.f238177b = r0
            com.google.protobuf.bv r0 = r1.build()
            com.google.android.apps.gsa.search.shared.service.b.oy r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy) r0
            com.google.android.apps.gsa.search.shared.service.j r1 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.OPA_CLIENT_INPUT
            r1.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r2)
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88092ow.f238173a
            r1.mo82014b(r2, r0)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r0 = r1.mo82013a()
            r15.mo96219b(r0)
        L_0x021c:
            r12.m179600e(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.chatui.OpaAppActionsSliceCard.mo96554b(androidx.slice.Slice, com.google.android.apps.gsa.shared.logger.b.i, com.google.android.apps.gsa.staticplugins.opa.az.i):void");
    }

    /* renamed from: c */
    public final boolean mo96555c(String str, String str2, int i, String str3, String str4, C91189au auVar, C89859i iVar, C107698i iVar2, C22871g gVar, C22871g gVar2) {
        this.f300901c = str2;
        this.f300910l = i;
        if (((C86124t) this.f300900b.mo27525b()).mo79746e(C90019by.f248080n)) {
            this.f300909k.f53827q = 2;
        } else {
            this.f300912n = auVar.mo85421i(str4, (ImageView) findViewById(R.id.slice_header_logo_url));
            ((TextView) findViewById(R.id.slice_header_app_name)).setText(str3);
            this.f300908j.mo8673h(i);
        }
        if (this.f300902d == null) {
            ((C59052c) ((C59052c) f300899a.mo56226d()).mo56372aa(24019)).mo56386p("Unable to retrieve SliceViewManager.");
            return false;
        }
        this.f300905g = Uri.parse(str);
        this.f300904f = new C108347fi(this, iVar, iVar2);
        this.f300906h = false;
        if ("com.google.android.apps.docs.slices".equals(this.f300905g.getAuthority())) {
            new C90873ag(gVar.mo28201a("bindSlice", new C108348fj(this)), gVar2, "Getting bound slice", new C108349fk(this, iVar, iVar2)).mo85223a(new C108350fl(this, str));
        } else {
            try {
                this.f300902d.mo8628c(this.f300905g, this.f300904f);
                this.f300906h = true;
                Slice a = this.f300902d.mo8626a(this.f300905g);
                this.f300903e = a;
                if (a == null) {
                    ((C59052c) ((C59052c) f300899a.mo56226d()).mo56372aa(24017)).mo56389s("Failed to retrieve initial slice from slice URI: %s", str);
                    this.f300902d.mo8630e(this.f300905g, this.f300904f);
                    this.f300906h = false;
                    return false;
                }
                mo96554b(a, iVar, iVar2);
            } catch (Resources.NotFoundException | IllegalArgumentException | SecurityException e) {
                ((C59052c) ((C59052c) f300899a.mo56225c()).mo56372aa(24018)).mo56389s("Cannot access slice URI: %s", e.getMessage());
                if (this.f300906h) {
                    this.f300902d.mo8630e(this.f300905g, this.f300904f);
                    this.f300906h = false;
                }
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        Uri uri;
        C4113l lVar;
        super.onDetachedFromWindow();
        if (this.f300906h && (uri = this.f300905g) != null && (lVar = this.f300904f) != null) {
            this.f300902d.mo8630e(uri, lVar);
            this.f300906h = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        AssistantSliceView assistantSliceView;
        super.onFinishInflate();
        ((C108188a) C47266f.m84076a(this.f300907i, C108188a.class)).mo96558qE(this);
        if (((C86124t) this.f300900b.mo27525b()).mo79746e(C90019by.f248080n)) {
            Context context = this.f300907i;
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.slice_card_wrapper);
            if (viewGroup.findViewById(R.id.assistant_slice_view_container) != null) {
                assistantSliceView = (AssistantSliceView) viewGroup.findViewById(R.id.assistant_slice_view);
            } else {
                viewGroup.removeAllViews();
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.assistant_slice_view, (ViewGroup) null);
                viewGroup.addView(linearLayout);
                assistantSliceView = (AssistantSliceView) linearLayout.findViewById(R.id.assistant_slice_view);
            }
            this.f300909k = assistantSliceView;
            assistantSliceView.f53827q = 2;
        } else {
            SliceView sliceView = (SliceView) findViewById(R.id.slice_view);
            sliceView.getClass();
            this.f300908j = sliceView;
            sliceView.mo8673h(this.f300910l);
        }
        TextView textView = (TextView) findViewById(R.id.slice_text);
        textView.getClass();
        this.f300911m = textView;
    }

    public OpaAppActionsSliceCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f300907i = context;
        this.f300902d = new C4121t(context);
        this.f300910l = 2;
    }

    public OpaAppActionsSliceCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f300907i = context;
        this.f300902d = new C4121t(context);
        this.f300910l = 2;
    }
}
