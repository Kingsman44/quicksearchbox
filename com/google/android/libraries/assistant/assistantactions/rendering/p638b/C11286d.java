package com.google.android.libraries.assistant.assistantactions.rendering.p638b;

import android.content.Context;
import android.support.p031v4.app.C0167am;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.p620b.C11054a;
import com.google.android.libraries.assistant.assistantactions.p633d.C11270g;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11291a;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11297e;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11301i;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.FormMainView;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.AudioRecorderField;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.EditableTextField;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.b.d */
/* compiled from: PG */
public final class C11286d {

    /* renamed from: a */
    public static final C58485gu f36705a = C58485gu.m89851s("ui.SHOW_TEXT", "ui.SHOW_NATIVE_FORM", "ui.KEEP_SCREEN_CONTENTS", "ui.HIGHLIGHT_USER_QUERY", "ui.SHOW_SUGGESTIONS", "ui.SHOW_STATUS");

    /* renamed from: b */
    public static final C58485gu f36706b = C58485gu.m89846n("ui.SHOW_NATIVE_FORM");

    /* renamed from: g */
    private static final C59071e f36707g = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.b.d");

    /* renamed from: c */
    final Map f36708c = new HashMap();

    /* renamed from: d */
    public final List f36709d = new ArrayList();

    /* renamed from: e */
    public AudioRecorderField f36710e = null;

    /* renamed from: f */
    final C11297e f36711f;

    /* renamed from: h */
    private LinearLayout f36712h;

    /* renamed from: i */
    private FormMainView f36713i;

    /* renamed from: j */
    private Context f36714j;

    /* renamed from: k */
    private C0167am f36715k;

    /* renamed from: l */
    private C11301i f36716l;

    /* renamed from: m */
    private final List f36717m;

    /* renamed from: n */
    private C11054a f36718n;

    /* renamed from: o */
    private C11270g f36719o;

    public C11286d() {
        C11291a aVar = new C11291a();
        aVar.mo19697c(C52507uh.f137838b);
        aVar.mo19696b(C51953ff.f136315l);
        this.f36711f = aVar;
        this.f36717m = new ArrayList();
    }

    /* renamed from: c */
    public static MessageLite m26792c(C51807dw dwVar, String str, C63010eb ebVar) {
        for (C52232kc kcVar : dwVar.f135932a) {
            if (str.equals(kcVar.f137065b)) {
                try {
                    C52230ka kaVar = kcVar.f137066c;
                    if (kaVar == null) {
                        kaVar = C52230ka.f137057d;
                    }
                    return (MessageLite) ebVar.mo59008g(kaVar.f137061c);
                } catch (C62974ct unused) {
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    private static int m26793e(Context context, int i) {
        return (int) ((((float) i) * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a */
    public final View mo19692a(C0167am amVar, C11301i iVar, C11054a aVar, C11270g gVar) {
        this.f36715k = amVar;
        this.f36714j = amVar;
        this.f36716l = iVar;
        this.f36718n = aVar;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(amVar).inflate(R.layout.container_view, (ViewGroup) null);
        this.f36712h = linearLayout;
        this.f36719o = gVar;
        return linearLayout;
    }

    /* renamed from: b */
    public final C58833ax mo19693b() {
        for (EditableTextField editableTextField : this.f36717m) {
            if (editableTextField.f37151j) {
                return C58833ax.m90834k(editableTextField);
            }
        }
        return C58836b.f156633a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v48, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v62, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChatMessageField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v110, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v123, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ButtonsField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v130, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v140, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v141, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v142, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v143, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v144, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v145, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v146, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v147, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v208, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.AudioRecorderField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v148, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v149, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v150, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v151, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v152, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v153, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v154, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v155, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v156, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v211, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v213, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v214, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ButtonField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v157, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v158, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v159, resolved type: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField} */
    /* JADX WARNING: type inference failed for: r3v35, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r3v41, types: [com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.n, com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.FamilyInfoField] */
    /* JADX WARNING: type inference failed for: r3v45, types: [com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.n, com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.CloudContactSelectionField] */
    /* JADX WARNING: type inference failed for: r3v49, types: [com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.n, com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.TimerInstance] */
    /* JADX WARNING: type inference failed for: r3v53, types: [com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.AlarmInstance, com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.n] */
    /* JADX WARNING: type inference failed for: r3v57, types: [com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.n, com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.DividerField] */
    /* JADX WARNING: type inference failed for: r3v66, types: [com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.n, com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ReceiptCardTimerField] */
    /* JADX WARNING: type inference failed for: r3v70, types: [com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ReceiptCard, com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.n] */
    /* JADX WARNING: type inference failed for: r25v1, types: [com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.SpacerField] */
    /* JADX WARNING: type inference failed for: r3v79, types: [com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.n, com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.DurationSelectionField] */
    /* JADX WARNING: type inference failed for: r3v83, types: [com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.n, com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.LocationSelectionField] */
    /* JADX WARNING: type inference failed for: r3v87, types: [com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.n, com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.RecurrenceSelectionField] */
    /* JADX WARNING: type inference failed for: r3v91, types: [com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.n, com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.TimeSelectionField] */
    /* JADX WARNING: type inference failed for: r3v95, types: [com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.n, com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.DateSelectionField] */
    /* JADX WARNING: type inference failed for: r3v100, types: [com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ContactSelectionFieldV2, com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.n] */
    /* JADX WARNING: type inference failed for: r3v105, types: [com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.n, com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ContactSelectionField] */
    /* JADX WARNING: type inference failed for: r3v109, types: [com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.BinarySelectionField, com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.n] */
    /* JADX WARNING: type inference failed for: r3v114, types: [com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ImageField, com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.n] */
    /* JADX WARNING: type inference failed for: r4v137, types: [com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.TextLabelField] */
    /* JADX WARNING: type inference failed for: r4v142, types: [com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.TextLabelField] */
    /* JADX WARNING: type inference failed for: r3v127, types: [com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ReceiptCardListField, com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.n] */
    /* JADX WARNING: type inference failed for: r4v176, types: [com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ListField, com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.n] */
    /* JADX WARNING: type inference failed for: r3v134, types: [com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.n, com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.EditableTextField, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0894  */
    /* JADX WARNING: Unknown variable types count: 19 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo19694d(com.google.assistant.p3897e.p3921j.C51809dy r32) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            java.lang.String r2 = r1.f135936b
            int r3 = r2.hashCode()
            r4 = 210787780(0xc905dc4, float:2.2243146E-31)
            r6 = 0
            if (r3 == r4) goto L_0x0011
            goto L_0x001b
        L_0x0011:
            java.lang.String r3 = "ui.SHOW_NATIVE_FORM"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x001b
            r2 = 0
            goto L_0x001c
        L_0x001b:
            r2 = -1
        L_0x001c:
            if (r2 == 0) goto L_0x0038
            com.google.common.f.e r2 = f36707g
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            r3 = 43156(0xa894, float:6.0474E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            java.lang.String r3 = "ClientOp cannot be handled by FormRender, clientOp = %s"
            java.lang.String r1 = r1.f135936b
            r2.mo56389s(r3, r1)
            goto L_0x0a4f
        L_0x0038:
            com.google.assistant.e.j.dw r2 = r1.f135938d
            if (r2 != 0) goto L_0x003e
            com.google.assistant.e.j.dw r2 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x003e:
            com.google.assistant.e.j.e.ff r3 = com.google.assistant.p3897e.p3921j.p3926e.C51953ff.f136315l
            com.google.protobuf.eb r3 = r3.getParserForType()
            java.lang.String r4 = "show_native_form_args"
            com.google.protobuf.MessageLite r2 = m26792c(r2, r4, r3)
            com.google.assistant.e.j.e.ff r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r2
            com.google.assistant.e.j.dw r1 = r1.f135938d
            if (r1 != 0) goto L_0x0052
            com.google.assistant.e.j.dw r1 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x0052:
            com.google.android.libraries.assistant.assistantactions.a.d r3 = com.google.android.libraries.assistant.assistantactions.p619a.C11053d.f36295b
            com.google.protobuf.eb r3 = r3.getParserForType()
            java.lang.String r4 = "show_native_form_field_update_args"
            com.google.protobuf.MessageLite r1 = m26792c(r1, r4, r3)
            com.google.android.libraries.assistant.assistantactions.a.d r1 = (com.google.android.libraries.assistant.assistantactions.p619a.C11053d) r1
            r3 = 1
            if (r1 == 0) goto L_0x009f
            com.google.protobuf.cq r1 = r1.f36297a
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
        L_0x006a:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x009d
            java.lang.Object r7 = r1.next()
            com.google.android.libraries.assistant.assistantactions.a.b r7 = (com.google.android.libraries.assistant.assistantactions.p619a.C11051b) r7
            int r8 = r7.f36292a
            r9 = r8 & 1
            if (r9 == 0) goto L_0x006a
            r8 = r8 & 2
            if (r8 == 0) goto L_0x006a
            java.util.Map r8 = r0.f36708c
            java.lang.String r9 = r7.f36293b
            boolean r8 = r8.containsKey(r9)
            if (r8 == 0) goto L_0x006a
            java.util.Map r8 = r0.f36708c
            java.lang.String r9 = r7.f36293b
            java.lang.Object r8 = r8.get(r9)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.n r8 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.C11407n) r8
            if (r8 == 0) goto L_0x006a
            boolean r4 = r7.f36294c
            r8.setEnabled(r4)
            r4 = 1
            goto L_0x006a
        L_0x009d:
            if (r4 != 0) goto L_0x0a4f
        L_0x009f:
            if (r2 == 0) goto L_0x0a4e
            int r1 = r2.f136326j
            com.google.assistant.e.j.e.fe r1 = com.google.assistant.p3897e.p3921j.p3926e.C51952fe.m86449a(r1)
            if (r1 != 0) goto L_0x00ab
            com.google.assistant.e.j.e.fe r1 = com.google.assistant.p3897e.p3921j.p3926e.C51952fe.RENDER_NEW_NATIVE_FORM_DEFAULT
        L_0x00ab:
            com.google.assistant.e.j.e.fe r4 = com.google.assistant.p3897e.p3921j.p3926e.C51952fe.FORM_FIELD_STATUS_UPDATE
            boolean r1 = r1.equals(r4)
            r4 = 33
            r7 = 17
            r8 = 8
            if (r1 == 0) goto L_0x01a0
            java.util.Map r1 = r0.f36708c
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00c3
            goto L_0x01a0
        L_0x00c3:
            com.google.protobuf.cq r1 = r2.f136319c
            java.util.Iterator r1 = r1.iterator()
            r9 = 0
        L_0x00ca:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x0132
            java.lang.Object r10 = r1.next()
            com.google.assistant.e.j.e.fa r10 = (com.google.assistant.p3897e.p3921j.p3926e.C51948fa) r10
            boolean r11 = r10.f136298c
            if (r11 != 0) goto L_0x00ca
            com.google.protobuf.cq r10 = r10.f136299d
            java.util.Iterator r10 = r10.iterator()
        L_0x00e0:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00ca
            java.lang.Object r11 = r10.next()
            com.google.assistant.e.j.e.ew r11 = (com.google.assistant.p3897e.p3921j.p3926e.C51943ew) r11
            boolean r12 = r11.f136290d
            if (r12 != 0) goto L_0x00e0
            com.google.protobuf.cq r11 = r11.f136288b
            java.util.Iterator r11 = r11.iterator()
        L_0x00f6:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00e0
            java.lang.Object r12 = r11.next()
            com.google.assistant.e.j.e.eu r12 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r12
            int r13 = r12.f136273a
            r13 = r13 & r8
            if (r13 == 0) goto L_0x00f6
            boolean r13 = r12.f136281i
            if (r13 != 0) goto L_0x00f6
            java.util.Map r13 = r0.f36708c
            java.lang.String r14 = r12.f136279g
            boolean r13 = r13.containsKey(r14)
            if (r13 != 0) goto L_0x012f
            com.google.common.f.e r1 = f36707g
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r9 = 43154(0xa892, float:6.0472E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r9)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            java.lang.String r9 = "Cannot find FormField with Id %s in current form."
            java.lang.String r10 = r12.f136279g
            r1.mo56389s(r9, r10)
            goto L_0x01a0
        L_0x012f:
            int r9 = r9 + 1
            goto L_0x00f6
        L_0x0132:
            java.util.Map r1 = r0.f36708c
            int r1 = r1.size()
            if (r1 != r9) goto L_0x01a0
            com.google.protobuf.cq r1 = r2.f136319c
            java.util.Iterator r1 = r1.iterator()
        L_0x0140:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0a4f
            java.lang.Object r2 = r1.next()
            com.google.assistant.e.j.e.fa r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51948fa) r2
            com.google.protobuf.cq r2 = r2.f136299d
            java.util.Iterator r2 = r2.iterator()
        L_0x0152:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0140
            java.lang.Object r5 = r2.next()
            com.google.assistant.e.j.e.ew r5 = (com.google.assistant.p3897e.p3921j.p3926e.C51943ew) r5
            com.google.protobuf.cq r5 = r5.f136288b
            java.util.Iterator r5 = r5.iterator()
        L_0x0164:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x0152
            java.lang.Object r9 = r5.next()
            com.google.assistant.e.j.e.eu r9 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r9
            int r10 = r9.f136273a
            r10 = r10 & r8
            if (r10 == 0) goto L_0x0164
            boolean r10 = r9.f136281i
            if (r10 != 0) goto L_0x0164
            java.util.Map r10 = r0.f36708c
            java.lang.String r11 = r9.f136279g
            boolean r10 = r10.containsKey(r11)
            if (r10 == 0) goto L_0x0164
            int r10 = r9.f136277e
            if (r10 != r7) goto L_0x0188
            goto L_0x018a
        L_0x0188:
            if (r10 != r4) goto L_0x0164
        L_0x018a:
            java.util.Map r10 = r0.f36708c
            java.lang.String r11 = r9.f136279g
            java.lang.Object r10 = r10.get(r11)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.n r10 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.C11407n) r10
            if (r10 == 0) goto L_0x0164
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r6 = new com.google.android.libraries.assistant.assistantactions.rendering.c.c
            r6.<init>(r9)
            r10.mo19821m(r6)
            r6 = 1
            goto L_0x0164
        L_0x01a0:
            java.util.List r1 = r0.f36717m
            r1.clear()
            com.google.android.libraries.assistant.assistantactions.rendering.c.e r1 = r0.f36711f
            com.google.android.libraries.assistant.assistantactions.rendering.c.a r1 = (com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11291a) r1
            r1.f36720a = r2
            java.util.List r1 = r0.f36709d
            java.util.Iterator r1 = r1.iterator()
        L_0x01b1:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x01c3
            java.lang.Object r9 = r1.next()
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ButtonField r9 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ButtonField) r9
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.CircleCountDownButton r9 = r9.f36920c
            r9.mo19777a()
            goto L_0x01b1
        L_0x01c3:
            java.util.List r1 = r0.f36709d
            r1.clear()
            java.util.Map r1 = r0.f36708c
            r1.clear()
            android.widget.LinearLayout r1 = r0.f36712h
            r1.removeAllViews()
            int r1 = r2.f136323g
            com.google.assistant.e.j.e.ep r1 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.m86435a(r1)
            if (r1 != 0) goto L_0x01dc
            com.google.assistant.e.j.e.ep r1 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.DEFAULT
        L_0x01dc:
            com.google.android.libraries.assistant.assistantactions.b.a r9 = r0.f36718n
            int r10 = r2.f136324h
            com.google.assistant.e.j.e.fc r10 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.m86447a(r10)
            if (r10 != 0) goto L_0x01e8
            com.google.assistant.e.j.e.fc r10 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.FORM_UI_THEME_DEFAULT
        L_0x01e8:
            boolean r11 = r9.mo19521b(r4)
            r12 = 6
            if (r11 == 0) goto L_0x01f5
            com.google.android.libraries.assistant.assistantactions.rendering.b.a r9 = new com.google.android.libraries.assistant.assistantactions.rendering.b.a
            r9.<init>()
            goto L_0x0214
        L_0x01f5:
            com.google.assistant.e.j.e.fc r11 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x0203
            com.google.android.libraries.assistant.assistantactions.rendering.b.f r9 = new com.google.android.libraries.assistant.assistantactions.rendering.b.f
            r9.<init>()
            goto L_0x0214
        L_0x0203:
            boolean r9 = r9.mo19521b(r12)
            if (r9 == 0) goto L_0x020f
            com.google.android.libraries.assistant.assistantactions.rendering.b.g r9 = new com.google.android.libraries.assistant.assistantactions.rendering.b.g
            r9.<init>()
            goto L_0x0214
        L_0x020f:
            com.google.android.libraries.assistant.assistantactions.rendering.b.h r9 = new com.google.android.libraries.assistant.assistantactions.rendering.b.h
            r9.<init>()
        L_0x0214:
            com.google.common.f.e r10 = f36707g
            com.google.common.f.x r10 = r10.mo56224b()
            java.lang.Class r11 = r9.getClass()
            java.lang.String r11 = r11.getSimpleName()
            r13 = 43152(0xa890, float:6.0469E-41)
            java.lang.String r14 = "renderForm(ShowNativeFormArgs), fluidActionThemeProvider: %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r13)).mo56389s(r14, r11)
            android.view.ContextThemeWrapper r10 = new android.view.ContextThemeWrapper
            android.content.Context r11 = r0.f36714j
            int r13 = r9.mo19689e(r1)
            r10.<init>(r11, r13)
            com.google.android.libraries.assistant.assistantactions.b.a r11 = r0.f36718n
            r13 = 30
            boolean r11 = r11.mo19521b(r13)
            r14 = 37
            r15 = 31
            if (r11 == 0) goto L_0x0291
            android.view.ContextThemeWrapper r11 = new android.view.ContextThemeWrapper
            int r4 = r9.mo19688d(r1)
            r11.<init>(r10, r4)
            com.google.android.libraries.assistant.assistantactions.b.a r4 = r0.f36718n
            boolean r4 = r4.mo19521b(r15)
            if (r4 == 0) goto L_0x0290
            com.google.android.libraries.assistant.assistantactions.b.a r4 = r0.f36718n
            boolean r4 = r4.mo19521b(r14)
            if (r4 == 0) goto L_0x0276
            android.view.ContextThemeWrapper r10 = new android.view.ContextThemeWrapper
            int r1 = r9.mo19685a(r1)
            r10.<init>(r11, r1)
            boolean r1 = com.google.android.material.p3505b.C44534d.m78715b()
            if (r1 == 0) goto L_0x0291
            android.content.res.Resources$Theme r1 = r10.getTheme()
            r4 = 2132150912(0x7f160a80, float:1.9943872E38)
            r1.applyStyle(r4, r3)
            goto L_0x0291
        L_0x0276:
            android.view.ContextThemeWrapper r10 = new android.view.ContextThemeWrapper
            int r1 = r9.mo19687c(r1)
            r10.<init>(r11, r1)
            boolean r1 = com.google.android.material.p3505b.C44534d.m78715b()
            if (r1 == 0) goto L_0x0291
            android.content.res.Resources$Theme r1 = r10.getTheme()
            r4 = 2132150627(0x7f160963, float:1.9943294E38)
            r1.applyStyle(r4, r3)
            goto L_0x0291
        L_0x0290:
            r10 = r11
        L_0x0291:
            int r1 = r9.mo19686b()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r10)
            r11 = 2131625050(0x7f0e045a, float:1.8877297E38)
            r14 = 0
            android.view.View r4 = r4.inflate(r11, r14)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.FormMainView r4 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.FormMainView) r4
            r0.f36713i = r4
            com.google.android.libraries.assistant.assistantactions.rendering.c.i r11 = r0.f36716l
            r4.f36753b = r11
            int r11 = r2.f136317a
            r11 = r11 & r3
            if (r11 == 0) goto L_0x02ba
            java.lang.String r11 = r2.f136318b
            android.widget.TextView r15 = r4.f36752a
            r15.setVisibility(r6)
            android.widget.TextView r4 = r4.f36752a
            r4.setText(r11)
        L_0x02ba:
            com.google.android.libraries.assistant.assistantactions.rendering.ui.FormMainView r4 = r0.f36713i
            com.google.android.libraries.assistant.assistantactions.rendering.b.b r11 = new com.google.android.libraries.assistant.assistantactions.rendering.b.b
            r11.<init>(r0)
            r4.f36754c = r11
            com.google.protobuf.cq r4 = r2.f136319c
            java.util.Iterator r4 = r4.iterator()
        L_0x02c9:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x09ca
            java.lang.Object r11 = r4.next()
            com.google.assistant.e.j.e.fa r11 = (com.google.assistant.p3897e.p3921j.p3926e.C51948fa) r11
            boolean r6 = r11.f136298c
            if (r6 != 0) goto L_0x09c7
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r10)
            r13 = 2131625051(0x7f0e045b, float:1.88773E38)
            android.view.View r6 = r6.inflate(r13, r14)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.FormSubSectionView r6 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.FormSubSectionView) r6
            int r13 = r11.f136296a
            r13 = r13 & r8
            if (r13 == 0) goto L_0x02f6
            com.google.android.libraries.logging.j r13 = new com.google.android.libraries.logging.j
            int r8 = r11.f136300e
            r13.<init>(r8)
            com.google.android.libraries.logging.C28295m.m52919e(r6, r13)
            goto L_0x0301
        L_0x02f6:
            com.google.android.libraries.logging.j r8 = new com.google.android.libraries.logging.j
            r13 = 79680(0x13740, float:1.11655E-40)
            r8.<init>(r13)
            com.google.android.libraries.logging.C28295m.m52919e(r6, r8)
        L_0x0301:
            com.google.protobuf.cq r8 = r11.f136299d
            java.util.Iterator r8 = r8.iterator()
        L_0x0307:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L_0x098f
            java.lang.Object r13 = r8.next()
            com.google.assistant.e.j.e.ew r13 = (com.google.assistant.p3897e.p3921j.p3926e.C51943ew) r13
            boolean r15 = r13.f136290d
            if (r15 != 0) goto L_0x098c
            android.view.LayoutInflater r15 = android.view.LayoutInflater.from(r10)
            r5 = 2131625049(0x7f0e0459, float:1.8877295E38)
            android.view.View r5 = r15.inflate(r5, r14)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.FormFieldGroupView r5 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.FormFieldGroupView) r5
            int r15 = r13.f136287a
            r7 = 4
            r15 = r15 & r7
            if (r15 == 0) goto L_0x0335
            com.google.android.libraries.logging.j r15 = new com.google.android.libraries.logging.j
            int r3 = r13.f136291e
            r15.<init>(r3)
            com.google.android.libraries.logging.C28295m.m52919e(r5, r15)
            goto L_0x0340
        L_0x0335:
            com.google.android.libraries.logging.j r3 = new com.google.android.libraries.logging.j
            r15 = 79681(0x13741, float:1.11657E-40)
            r3.<init>(r15)
            com.google.android.libraries.logging.C28295m.m52919e(r5, r3)
        L_0x0340:
            com.google.protobuf.cq r3 = r13.f136288b
            java.util.Iterator r13 = r3.iterator()
            r15 = 0
            r16 = 0
        L_0x0349:
            boolean r17 = r13.hasNext()
            r12 = 25
            if (r17 == 0) goto L_0x036d
            java.lang.Object r17 = r13.next()
            r14 = r17
            com.google.assistant.e.j.e.eu r14 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r14
            boolean r7 = r14.f136281i
            if (r7 != 0) goto L_0x0369
            int r7 = r14.f136277e
            if (r7 != r12) goto L_0x0363
            r7 = 1
            goto L_0x0364
        L_0x0363:
            r7 = 0
        L_0x0364:
            r12 = r7 ^ 1
            r16 = r12 | r16
            r15 = r15 | r7
        L_0x0369:
            r7 = 4
            r12 = 6
            r14 = 0
            goto L_0x0349
        L_0x036d:
            if (r15 == 0) goto L_0x0373
            if (r16 == 0) goto L_0x0373
            r7 = 1
            goto L_0x0374
        L_0x0373:
            r7 = 0
        L_0x0374:
            java.util.Iterator r3 = r3.iterator()
        L_0x0378:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto L_0x095f
            java.lang.Object r13 = r3.next()
            com.google.assistant.e.j.e.eu r13 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r13
            boolean r14 = r13.f136281i
            if (r14 != 0) goto L_0x0378
            java.lang.String r14 = r2.f136320d
            boolean r15 = r14.isEmpty()
            if (r15 != 0) goto L_0x039a
            java.lang.String r15 = r13.f136279g
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x039a
            r14 = 1
            goto L_0x039b
        L_0x039a:
            r14 = 0
        L_0x039b:
            com.google.android.libraries.assistant.assistantactions.rendering.c.g r15 = new com.google.android.libraries.assistant.assistantactions.rendering.c.g
            com.google.android.libraries.assistant.assistantactions.rendering.c.i r12 = r0.f36716l
            r26 = r3
            com.google.android.libraries.assistant.assistantactions.rendering.b.c r3 = new com.google.android.libraries.assistant.assistantactions.rendering.b.c
            r3.<init>(r0)
            r27 = r4
            android.support.v4.app.am r4 = r0.f36715k
            r28 = r8
            com.google.android.libraries.assistant.assistantactions.b.a r8 = r0.f36718n
            r29 = r11
            com.google.android.libraries.assistant.assistantactions.rendering.c.j r11 = new com.google.android.libraries.assistant.assistantactions.rendering.c.j
            r30 = r6
            boolean r6 = r2.f136322f
            r11.<init>(r6)
            com.google.android.libraries.assistant.assistantactions.d.g r6 = r0.f36719o
            r16 = r15
            r17 = r10
            r18 = r13
            r19 = r12
            r20 = r3
            r21 = r4
            r22 = r8
            r23 = r11
            r24 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            int r3 = r13.f136277e
            r6 = 1065353216(0x3f800000, float:1.0)
            r12 = 3
            r4 = 4
            if (r3 != r4) goto L_0x0405
            android.content.Context r3 = r15.f36731a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131624797(0x7f0e035d, float:1.8876784E38)
            r11 = 0
            android.view.View r3 = r3.inflate(r4, r11)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.EditableTextField r3 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.EditableTextField) r3
            int r4 = r9.mo19690f()
            r3.mo19945n(r15, r4)
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r4 = new com.google.android.libraries.assistant.assistantactions.rendering.c.c
            com.google.assistant.e.j.e.eu r11 = r15.f36732b
            r4.<init>(r11)
            r3.mo19821m(r4)
            java.util.List r4 = r0.f36717m
            r4.add(r3)
        L_0x03fe:
            r11 = r3
        L_0x03ff:
            r4 = 33
            r6 = 17
            goto L_0x0892
        L_0x0405:
            r4 = 6
            if (r3 != r4) goto L_0x0467
            int r3 = r9.mo19690f()
            com.google.assistant.e.j.e.eu r11 = r15.f36732b
            int r8 = r11.f136277e
            if (r8 != r4) goto L_0x0417
            java.lang.Object r4 = r11.f136278f
            com.google.assistant.e.c.c.du r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51030du) r4
            goto L_0x0419
        L_0x0417:
            com.google.assistant.e.c.c.du r4 = com.google.assistant.p3897e.p3902c.p3907c.C51030du.f132868g
        L_0x0419:
            int r4 = r4.f132873d
            int r4 = com.google.assistant.p3897e.p3902c.p3907c.C51023dn.m86015a(r4)
            if (r4 != 0) goto L_0x0422
            goto L_0x0429
        L_0x0422:
            if (r4 != r12) goto L_0x0429
            r4 = 2131625830(0x7f0e0766, float:1.887888E38)
            r11 = 6
            goto L_0x044b
        L_0x0429:
            com.google.assistant.e.j.e.eu r4 = r15.f36732b
            int r8 = r4.f136277e
            r11 = 6
            if (r8 != r11) goto L_0x0435
            java.lang.Object r4 = r4.f136278f
            com.google.assistant.e.c.c.du r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51030du) r4
            goto L_0x0437
        L_0x0435:
            com.google.assistant.e.c.c.du r4 = com.google.assistant.p3897e.p3902c.p3907c.C51030du.f132868g
        L_0x0437:
            int r4 = r4.f132873d
            int r4 = com.google.assistant.p3897e.p3902c.p3907c.C51023dn.m86015a(r4)
            r8 = 2131625825(0x7f0e0761, float:1.8878869E38)
            if (r4 != 0) goto L_0x0446
        L_0x0442:
            r4 = 2131625825(0x7f0e0761, float:1.8878869E38)
            goto L_0x044b
        L_0x0446:
            if (r4 != r11) goto L_0x0442
            r4 = 2131625831(0x7f0e0767, float:1.8878881E38)
        L_0x044b:
            android.content.Context r8 = r15.f36731a
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r8)
            r11 = 0
            android.view.View r4 = r8.inflate(r4, r11)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ListField r4 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ListField) r4
            r4.mo19945n(r15, r3)
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r3 = new com.google.android.libraries.assistant.assistantactions.rendering.c.c
            com.google.assistant.e.j.e.eu r8 = r15.f36732b
            r3.<init>(r8)
            r4.mo19821m(r3)
            r11 = r4
            goto L_0x03ff
        L_0x0467:
            r4 = 34
            if (r3 != r4) goto L_0x0490
            android.content.Context r3 = r15.f36731a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131626679(0x7f0e0ab7, float:1.88806E38)
            r8 = 0
            android.view.View r3 = r3.inflate(r4, r8)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ReceiptCardListField r3 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ReceiptCardListField) r3
            int r4 = r9.mo19690f()
            r3.mo19945n(r15, r4)
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r4 = new com.google.android.libraries.assistant.assistantactions.rendering.c.c
            com.google.assistant.e.j.e.eu r8 = r15.f36732b
            r4.<init>(r8)
            r3.f37153l = r4
            r3.mo19809b()
            goto L_0x03fe
        L_0x0490:
            r4 = 10
            if (r3 != r4) goto L_0x04b9
            r5.setGravity(r1)
            android.content.Context r3 = r15.f36731a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131624477(0x7f0e021d, float:1.8876135E38)
            r8 = 0
            android.view.View r3 = r3.inflate(r4, r8)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ButtonsField r3 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ButtonsField) r3
            r4 = 1
            r3.mo19945n(r15, r4)
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r4 = new com.google.android.libraries.assistant.assistantactions.rendering.c.c
            com.google.assistant.e.j.e.eu r8 = r15.f36732b
            r4.<init>(r8)
            r3.f37153l = r4
            r3.mo19809b()
            goto L_0x03fe
        L_0x04b9:
            r4 = 17
            if (r3 != r4) goto L_0x055a
            r5.setGravity(r1)
            int r3 = r9.mo19690f()
            com.google.assistant.e.j.e.eu r8 = r15.f36732b
            int r11 = r8.f136277e
            if (r11 != r4) goto L_0x0506
            java.lang.Object r4 = r8.f136278f
            com.google.assistant.e.c.c.ah r4 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r4
            int r4 = r4.f132602h
            com.google.assistant.e.c.c.ac r4 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.m85981a(r4)
            if (r4 != 0) goto L_0x04d8
            com.google.assistant.e.c.c.ac r4 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.DEFAULT
        L_0x04d8:
            com.google.assistant.e.c.c.ac r8 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.FULL_WIDTH
            if (r4 != r8) goto L_0x0506
            com.google.common.f.e r4 = com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ButtonField.f36918a
            com.google.common.f.x r4 = r4.mo56224b()
            java.lang.String r8 = "create full button field!!!!"
            r11 = 43216(0xa8d0, float:6.0559E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r11)).mo56386p(r8)
            android.content.Context r4 = r15.f36731a
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r8 = 2131625136(0x7f0e04b0, float:1.8877471E38)
            r11 = 0
            android.view.View r4 = r4.inflate(r8, r11)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ButtonField r4 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ButtonField) r4
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r11 = -1
            r8.<init>(r11, r11, r6)
            r4.setLayoutParams(r8)
            r6 = 17
            goto L_0x0545
        L_0x0506:
            com.google.common.f.e r4 = com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ButtonField.f36918a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            r8 = 43215(0xa8cf, float:6.0557E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r8)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            com.google.assistant.e.j.e.eu r8 = r15.f36732b
            int r11 = r8.f136277e
            r6 = 17
            if (r11 != r6) goto L_0x0524
            java.lang.Object r8 = r8.f136278f
            com.google.assistant.e.c.c.ah r8 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r8
            goto L_0x0526
        L_0x0524:
            com.google.assistant.e.c.c.ah r8 = com.google.assistant.p3897e.p3902c.p3907c.C50936ah.f132593m
        L_0x0526:
            int r8 = r8.f132602h
            com.google.assistant.e.c.c.ac r8 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.m85981a(r8)
            if (r8 != 0) goto L_0x0530
            com.google.assistant.e.c.c.ac r8 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.DEFAULT
        L_0x0530:
            java.lang.String r11 = "create button field!!!!, type %s"
            r4.mo56389s(r11, r8)
            android.content.Context r4 = r15.f36731a
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r8 = 2131624473(0x7f0e0219, float:1.8876127E38)
            r11 = 0
            android.view.View r4 = r4.inflate(r8, r11)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ButtonField r4 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ButtonField) r4
        L_0x0545:
            r4.mo19945n(r15, r3)
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r3 = new com.google.android.libraries.assistant.assistantactions.rendering.c.c
            com.google.assistant.e.j.e.eu r8 = r15.f36732b
            r3.<init>(r8)
            r4.f37153l = r3
            r4.mo19809b()
            java.util.List r3 = r0.f36709d
            r3.add(r4)
            goto L_0x0599
        L_0x055a:
            r6 = 17
            if (r3 != r12) goto L_0x059b
            int r3 = r9.mo19690f()
            com.google.android.libraries.assistant.assistantactions.rendering.c.j r4 = r15.f36737g
            boolean r4 = r4.f36739a
            if (r4 == 0) goto L_0x057c
            r4 = 2
            if (r3 != r4) goto L_0x057c
            android.content.Context r4 = r15.f36731a
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r8 = 2131627075(0x7f0e0c43, float:1.8881404E38)
            r11 = 0
            android.view.View r4 = r4.inflate(r8, r11)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.TextLabelField r4 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.TextLabelField) r4
            goto L_0x058c
        L_0x057c:
            r11 = 0
            android.content.Context r4 = r15.f36731a
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r8 = 2131627074(0x7f0e0c42, float:1.8881402E38)
            android.view.View r4 = r4.inflate(r8, r11)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.TextLabelField r4 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.TextLabelField) r4
        L_0x058c:
            r4.mo19945n(r15, r3)
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r3 = new com.google.android.libraries.assistant.assistantactions.rendering.c.c
            com.google.assistant.e.j.e.eu r8 = r15.f36732b
            r3.<init>(r8)
            r4.mo19821m(r3)
        L_0x0599:
            r11 = r4
            goto L_0x05be
        L_0x059b:
            r4 = 14
            if (r3 != r4) goto L_0x05c2
            android.content.Context r3 = r15.f36731a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131625615(0x7f0e068f, float:1.8878443E38)
            r8 = 0
            android.view.View r3 = r3.inflate(r4, r8)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ImageField r3 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ImageField) r3
            r4 = 1
            r3.mo19945n(r15, r4)
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r4 = new com.google.android.libraries.assistant.assistantactions.rendering.c.c
            com.google.assistant.e.j.e.eu r8 = r15.f36732b
            r4.<init>(r8)
            r3.mo19821m(r4)
        L_0x05bd:
            r11 = r3
        L_0x05be:
            r4 = 33
            goto L_0x0892
        L_0x05c2:
            r4 = 5
            if (r3 != r4) goto L_0x05e7
            android.content.Context r3 = r15.f36731a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131624440(0x7f0e01f8, float:1.887606E38)
            r8 = 0
            android.view.View r3 = r3.inflate(r4, r8)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.BinarySelectionField r3 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.BinarySelectionField) r3
            r4 = 1
            r3.mo19945n(r15, r4)
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r4 = new com.google.android.libraries.assistant.assistantactions.rendering.c.c
            com.google.assistant.e.j.e.eu r8 = r15.f36732b
            r4.<init>(r8)
            r3.mo19821m(r4)
            r3.mo19818k()
            goto L_0x05bd
        L_0x05e7:
            r4 = 16
            if (r3 != r4) goto L_0x0632
            boolean r3 = r9 instanceof com.google.android.libraries.assistant.assistantactions.rendering.p638b.C11288f
            if (r3 != 0) goto L_0x0613
            boolean r3 = r9 instanceof com.google.android.libraries.assistant.assistantactions.rendering.p638b.C11283a
            if (r3 == 0) goto L_0x05f4
            goto L_0x0613
        L_0x05f4:
            android.content.Context r3 = r15.f36731a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131624640(0x7f0e02c0, float:1.8876465E38)
            r8 = 0
            android.view.View r3 = r3.inflate(r4, r8)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ContactSelectionField r3 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ContactSelectionField) r3
            r4 = 1
            r3.mo19945n(r15, r4)
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r4 = new com.google.android.libraries.assistant.assistantactions.rendering.c.c
            com.google.assistant.e.j.e.eu r8 = r15.f36732b
            r4.<init>(r8)
            r3.mo19821m(r4)
            goto L_0x05bd
        L_0x0613:
            android.content.Context r3 = r15.f36731a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131624641(0x7f0e02c1, float:1.8876467E38)
            r8 = 0
            android.view.View r3 = r3.inflate(r4, r8)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ContactSelectionFieldV2 r3 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ContactSelectionFieldV2) r3
            r4 = 1
            r3.mo19945n(r15, r4)
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r4 = new com.google.android.libraries.assistant.assistantactions.rendering.c.c
            com.google.assistant.e.j.e.eu r8 = r15.f36732b
            r4.<init>(r8)
            r3.mo19821m(r4)
            goto L_0x05bd
        L_0x0632:
            r4 = 12
            if (r3 != r4) goto L_0x0656
            android.content.Context r3 = r15.f36731a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131624699(0x7f0e02fb, float:1.8876585E38)
            r8 = 0
            android.view.View r3 = r3.inflate(r4, r8)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.DateSelectionField r3 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.DateSelectionField) r3
            r4 = 1
            r3.mo19945n(r15, r4)
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r4 = new com.google.android.libraries.assistant.assistantactions.rendering.c.c
            com.google.assistant.e.j.e.eu r8 = r15.f36732b
            r4.<init>(r8)
            r3.mo19821m(r4)
            goto L_0x05bd
        L_0x0656:
            r4 = 9
            if (r3 != r4) goto L_0x067d
            android.content.Context r3 = r15.f36731a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131627089(0x7f0e0c51, float:1.8881433E38)
            r8 = 0
            android.view.View r3 = r3.inflate(r4, r8)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.TimeSelectionField r3 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.TimeSelectionField) r3
            int r4 = r9.mo19690f()
            r3.mo19945n(r15, r4)
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r4 = new com.google.android.libraries.assistant.assistantactions.rendering.c.c
            com.google.assistant.e.j.e.eu r8 = r15.f36732b
            r4.<init>(r8)
            r3.mo19821m(r4)
            goto L_0x05bd
        L_0x067d:
            r4 = 7
            if (r3 != r4) goto L_0x06a3
            android.content.Context r3 = r15.f36731a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131626689(0x7f0e0ac1, float:1.8880621E38)
            r8 = 0
            android.view.View r3 = r3.inflate(r4, r8)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.RecurrenceSelectionField r3 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.RecurrenceSelectionField) r3
            int r4 = r9.mo19690f()
            r3.mo19945n(r15, r4)
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r4 = new com.google.android.libraries.assistant.assistantactions.rendering.c.c
            com.google.assistant.e.j.e.eu r8 = r15.f36732b
            r4.<init>(r8)
            r3.mo19821m(r4)
            goto L_0x05bd
        L_0x06a3:
            r4 = 11
            if (r3 != r4) goto L_0x06c7
            android.content.Context r3 = r15.f36731a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131625843(0x7f0e0773, float:1.8878905E38)
            r8 = 0
            android.view.View r3 = r3.inflate(r4, r8)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.LocationSelectionField r3 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.LocationSelectionField) r3
            r4 = 1
            r3.mo19945n(r15, r4)
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r4 = new com.google.android.libraries.assistant.assistantactions.rendering.c.c
            com.google.assistant.e.j.e.eu r8 = r15.f36732b
            r4.<init>(r8)
            r3.mo19821m(r4)
            goto L_0x05bd
        L_0x06c7:
            r4 = 21
            if (r3 != r4) goto L_0x06ee
            android.content.Context r3 = r15.f36731a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131624789(0x7f0e0355, float:1.8876768E38)
            r8 = 0
            android.view.View r3 = r3.inflate(r4, r8)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.DurationSelectionField r3 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.DurationSelectionField) r3
            int r4 = r9.mo19690f()
            r3.mo19945n(r15, r4)
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r4 = new com.google.android.libraries.assistant.assistantactions.rendering.c.c
            com.google.assistant.e.j.e.eu r8 = r15.f36732b
            r4.<init>(r8)
            r3.mo19821m(r4)
            goto L_0x05bd
        L_0x06ee:
            r4 = 23
            if (r3 != r4) goto L_0x072d
            int r3 = r9.mo19690f()
            com.google.common.f.e r4 = com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.AudioRecorderField.f36893a
            r4 = 2
            if (r3 != r4) goto L_0x070c
            android.content.Context r4 = r15.f36731a
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r8 = 2131624417(0x7f0e01e1, float:1.8876013E38)
            r11 = 0
            android.view.View r4 = r4.inflate(r8, r11)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.AudioRecorderField r4 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.AudioRecorderField) r4
            goto L_0x071c
        L_0x070c:
            r11 = 0
            android.content.Context r4 = r15.f36731a
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r8 = 2131624416(0x7f0e01e0, float:1.8876011E38)
            android.view.View r4 = r4.inflate(r8, r11)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.AudioRecorderField r4 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.AudioRecorderField) r4
        L_0x071c:
            r4.mo19945n(r15, r3)
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r3 = new com.google.android.libraries.assistant.assistantactions.rendering.c.c
            com.google.assistant.e.j.e.eu r8 = r15.f36732b
            r3.<init>(r8)
            r4.mo19821m(r3)
            r0.f36710e = r4
            goto L_0x0599
        L_0x072d:
            r4 = 25
            if (r3 != r4) goto L_0x0747
            android.content.Context r3 = r15.f36731a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131626898(0x7f0e0b92, float:1.8881045E38)
            r8 = 0
            android.view.View r3 = r3.inflate(r4, r8)
            r25 = r3
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.SpacerField r25 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.SpacerField) r25
            r11 = r25
            goto L_0x05be
        L_0x0747:
            r8 = 0
            r4 = 26
            if (r3 != r4) goto L_0x076b
            android.content.Context r3 = r15.f36731a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131626678(0x7f0e0ab6, float:1.8880599E38)
            android.view.View r3 = r3.inflate(r4, r8)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ReceiptCard r3 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ReceiptCard) r3
            r4 = 1
            r3.mo19945n(r15, r4)
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r4 = new com.google.android.libraries.assistant.assistantactions.rendering.c.c
            com.google.assistant.e.j.e.eu r8 = r15.f36732b
            r4.<init>(r8)
            r3.mo19821m(r4)
            goto L_0x05bd
        L_0x076b:
            r4 = 36
            if (r3 != r4) goto L_0x078f
            android.content.Context r3 = r15.f36731a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131626681(0x7f0e0ab9, float:1.8880605E38)
            r8 = 0
            android.view.View r3 = r3.inflate(r4, r8)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ReceiptCardTimerField r3 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ReceiptCardTimerField) r3
            r4 = 1
            r3.mo19945n(r15, r4)
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r4 = new com.google.android.libraries.assistant.assistantactions.rendering.c.c
            com.google.assistant.e.j.e.eu r8 = r15.f36732b
            r4.<init>(r8)
            r3.mo19821m(r4)
            goto L_0x05bd
        L_0x078f:
            r4 = 27
            if (r3 != r4) goto L_0x07b7
            int r3 = com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ChatMessageField.f36924a
            android.content.Context r3 = r15.f36731a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131624532(0x7f0e0254, float:1.8876246E38)
            r8 = 0
            android.view.View r3 = r3.inflate(r4, r8)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChatMessageField r3 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ChatMessageField) r3
            r4 = 1
            r3.mo19945n(r15, r4)
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r4 = new com.google.android.libraries.assistant.assistantactions.rendering.c.c
            com.google.assistant.e.j.e.eu r8 = r15.f36732b
            r4.<init>(r8)
            r3.f37153l = r4
            r3.mo19809b()
            goto L_0x05bd
        L_0x07b7:
            r4 = 30
            if (r3 != r4) goto L_0x07db
            android.content.Context r3 = r15.f36731a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131624770(0x7f0e0342, float:1.887673E38)
            r8 = 0
            android.view.View r3 = r3.inflate(r4, r8)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.DividerField r3 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.DividerField) r3
            r4 = 1
            r3.mo19945n(r15, r4)
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r4 = new com.google.android.libraries.assistant.assistantactions.rendering.c.c
            com.google.assistant.e.j.e.eu r8 = r15.f36732b
            r4.<init>(r8)
            r3.mo19821m(r4)
            goto L_0x05bd
        L_0x07db:
            r4 = 28
            if (r3 != r4) goto L_0x07ff
            android.content.Context r3 = r15.f36731a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131624093(0x7f0e009d, float:1.8875356E38)
            r8 = 0
            android.view.View r3 = r3.inflate(r4, r8)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.AlarmInstance r3 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.AlarmInstance) r3
            r4 = 1
            r3.mo19945n(r15, r4)
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r4 = new com.google.android.libraries.assistant.assistantactions.rendering.c.c
            com.google.assistant.e.j.e.eu r8 = r15.f36732b
            r4.<init>(r8)
            r3.mo19821m(r4)
            goto L_0x05bd
        L_0x07ff:
            r4 = 29
            if (r3 != r4) goto L_0x0823
            android.content.Context r3 = r15.f36731a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131627092(0x7f0e0c54, float:1.8881439E38)
            r8 = 0
            android.view.View r3 = r3.inflate(r4, r8)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.TimerInstance r3 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.TimerInstance) r3
            r4 = 1
            r3.mo19945n(r15, r4)
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r4 = new com.google.android.libraries.assistant.assistantactions.rendering.c.c
            com.google.assistant.e.j.e.eu r8 = r15.f36732b
            r4.<init>(r8)
            r3.mo19821m(r4)
            goto L_0x05bd
        L_0x0823:
            r4 = 32
            if (r3 != r4) goto L_0x0847
            android.content.Context r3 = r15.f36731a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131624588(0x7f0e028c, float:1.887636E38)
            r8 = 0
            android.view.View r3 = r3.inflate(r4, r8)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.CloudContactSelectionField r3 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.CloudContactSelectionField) r3
            r4 = 1
            r3.mo19945n(r15, r4)
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r4 = new com.google.android.libraries.assistant.assistantactions.rendering.c.c
            com.google.assistant.e.j.e.eu r8 = r15.f36732b
            r4.<init>(r8)
            r3.mo19821m(r4)
            goto L_0x05bd
        L_0x0847:
            r4 = 31
            if (r3 != r4) goto L_0x086b
            android.content.Context r3 = r15.f36731a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131624970(0x7f0e040a, float:1.8877135E38)
            r8 = 0
            android.view.View r3 = r3.inflate(r4, r8)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.FamilyInfoField r3 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.FamilyInfoField) r3
            r4 = 1
            r3.mo19945n(r15, r4)
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r4 = new com.google.android.libraries.assistant.assistantactions.rendering.c.c
            com.google.assistant.e.j.e.eu r8 = r15.f36732b
            r4.<init>(r8)
            r3.mo19821m(r4)
            goto L_0x05bd
        L_0x086b:
            r4 = 33
            if (r3 != r4) goto L_0x0891
            android.content.Context r3 = r15.f36731a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r8 = 2131624572(0x7f0e027c, float:1.8876328E38)
            r11 = 0
            android.view.View r3 = r3.inflate(r8, r11)
            r11 = r3
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField r11 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ChipCarouselField) r11
            r3 = 1
            r11.mo19945n(r15, r3)
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r3 = new com.google.android.libraries.assistant.assistantactions.rendering.c.c
            com.google.assistant.e.j.e.eu r8 = r15.f36732b
            r3.<init>(r8)
            r11.f37153l = r3
            r11.mo19809b()
            goto L_0x0892
        L_0x0891:
            r11 = 0
        L_0x0892:
            if (r11 == 0) goto L_0x0951
            r11.mo19853q(r14)
            int r3 = r13.f136273a
            r8 = 8
            r3 = r3 & r8
            if (r3 == 0) goto L_0x08a5
            java.util.Map r3 = r0.f36708c
            java.lang.String r8 = r13.f136279g
            r3.put(r8, r11)
        L_0x08a5:
            boolean r3 = r11 instanceof com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ButtonField
            if (r3 == 0) goto L_0x08b1
            r5.addView(r11)
            r4 = -1
            r15 = 25
            goto L_0x091b
        L_0x08b1:
            boolean r3 = r11 instanceof com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.SpacerField
            if (r3 == 0) goto L_0x0905
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            int r8 = r13.f136277e
            r15 = 25
            if (r8 != r15) goto L_0x08c2
            java.lang.Object r8 = r13.f136278f
            com.google.assistant.e.c.c.hn r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51131hn) r8
            goto L_0x08c4
        L_0x08c2:
            com.google.assistant.e.c.c.hn r8 = com.google.assistant.p3897e.p3902c.p3907c.C51131hn.f133088b
        L_0x08c4:
            int r8 = r8.f133090a
            int r8 = com.google.assistant.p3897e.p3902c.p3907c.C51130hm.m86034a(r8)
            if (r8 != 0) goto L_0x08cd
            r8 = 1
        L_0x08cd:
            r20 = -1
            int r8 = r8 + -1
            r4 = 1
            if (r8 == r4) goto L_0x08f5
            r4 = 2
            if (r8 == r4) goto L_0x08ee
            if (r8 == r12) goto L_0x08e6
            r4 = 4
            if (r8 == r4) goto L_0x08df
            r4 = 0
            r8 = -1
            goto L_0x08fc
        L_0x08df:
            r4 = 28
            int r4 = m26793e(r10, r4)
            goto L_0x08ec
        L_0x08e6:
            r4 = 20
            int r4 = m26793e(r10, r4)
        L_0x08ec:
            r8 = r4
            goto L_0x08fb
        L_0x08ee:
            r4 = 16
            int r8 = m26793e(r10, r4)
            goto L_0x08fb
        L_0x08f5:
            r4 = 8
            int r8 = m26793e(r10, r4)
        L_0x08fb:
            r4 = 0
        L_0x08fc:
            r12 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r4, r8, r12)
            r5.addView(r11, r3)
            goto L_0x090f
        L_0x0905:
            r4 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
            r15 = 25
            if (r7 == 0) goto L_0x0911
            r5.addView(r11)
        L_0x090f:
            r4 = -1
            goto L_0x091b
        L_0x0911:
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r8 = -2
            r4 = -1
            r3.<init>(r4, r8, r12)
            r5.addView(r11, r3)
        L_0x091b:
            int r3 = r13.f136274b
            r8 = 16
            r3 = r3 & r8
            if (r3 == 0) goto L_0x0935
            com.google.android.libraries.logging.j r3 = new com.google.android.libraries.logging.j
            int r8 = r13.f136283k
            r3.<init>(r8)
            r8 = 5
            r3.mo33795i(r8)
            r12 = 4
            r3.mo33795i(r12)
            com.google.android.libraries.logging.C28295m.m52919e(r11, r3)
            goto L_0x0948
        L_0x0935:
            r8 = 5
            r12 = 4
            com.google.android.libraries.logging.j r3 = new com.google.android.libraries.logging.j
            r13 = 79682(0x13742, float:1.11658E-40)
            r3.<init>(r13)
            r3.mo33795i(r8)
            r3.mo33795i(r12)
            com.google.android.libraries.logging.C28295m.m52919e(r11, r3)
        L_0x0948:
            if (r14 == 0) goto L_0x094e
            r11.mo19841o()
            goto L_0x0951
        L_0x094e:
            r11.mo19843p()
        L_0x0951:
            r3 = r26
            r4 = r27
            r8 = r28
            r11 = r29
            r6 = r30
            r12 = 25
            goto L_0x0378
        L_0x095f:
            r27 = r4
            r30 = r6
            r28 = r8
            r29 = r11
            r4 = -1
            r6 = 17
            int r3 = r5.getChildCount()
            if (r3 == 0) goto L_0x097d
            r3 = r30
            r3.addView(r5)
            r6 = r3
            r4 = r27
            r8 = r28
            r11 = r29
            goto L_0x0985
        L_0x097d:
            r4 = r27
            r8 = r28
            r11 = r29
            r6 = r30
        L_0x0985:
            r3 = 1
            r7 = 17
            r12 = 6
            r14 = 0
            goto L_0x0307
        L_0x098c:
            r3 = 1
            goto L_0x0307
        L_0x098f:
            r27 = r4
            r3 = r6
            r4 = -1
            r6 = 17
            boolean r5 = r11.f136301f
            if (r5 == 0) goto L_0x09b4
            boolean r5 = com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e.m26914g(r10)
            if (r5 == 0) goto L_0x09aa
            r5 = 2131232051(0x7f080533, float:1.80802E38)
            android.graphics.drawable.Drawable r5 = r10.getDrawable(r5)
            r3.setBackground(r5)
            goto L_0x09b4
        L_0x09aa:
            r5 = 2131232052(0x7f080534, float:1.8080202E38)
            android.graphics.drawable.Drawable r5 = r10.getDrawable(r5)
            r3.setBackground(r5)
        L_0x09b4:
            com.google.android.libraries.assistant.assistantactions.rendering.ui.FormMainView r5 = r0.f36713i
            r5.addView(r3)
            r4 = r27
            r3 = 1
            r6 = 0
            r7 = 17
            r8 = 8
            r12 = 6
            r13 = 30
            r14 = 0
            goto L_0x02c9
        L_0x09c7:
            r6 = 0
            goto L_0x02c9
        L_0x09ca:
            boolean r1 = r9 instanceof com.google.android.libraries.assistant.assistantactions.rendering.p638b.C11283a
            if (r1 == 0) goto L_0x09db
            com.google.android.libraries.assistant.assistantactions.rendering.ui.FormMainView r1 = r0.f36713i
            r2 = 2131232050(0x7f080532, float:1.8080198E38)
            android.graphics.drawable.Drawable r2 = r10.getDrawable(r2)
            r1.setBackground(r2)
            goto L_0x0a45
        L_0x09db:
            com.google.android.libraries.assistant.assistantactions.b.a r1 = r0.f36718n
            r3 = 30
            boolean r1 = r1.mo19521b(r3)
            if (r1 == 0) goto L_0x0a1b
            com.google.android.libraries.assistant.assistantactions.b.a r1 = r0.f36718n
            r3 = 31
            boolean r1 = r1.mo19521b(r3)
            if (r1 == 0) goto L_0x0a1b
            com.google.android.libraries.assistant.assistantactions.b.a r1 = r0.f36718n
            r3 = 37
            boolean r1 = r1.mo19521b(r3)
            if (r1 == 0) goto L_0x0a1b
            com.google.android.libraries.assistant.assistantactions.rendering.ui.FormMainView r1 = r0.f36713i
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            if (r1 == 0) goto L_0x0a45
            r1 = 2131232049(0x7f080531, float:1.8080196E38)
            android.graphics.drawable.Drawable r1 = r10.getDrawable(r1)
            r1.getClass()
            r2 = 2131168122(0x7f070b7a, float:1.7950537E38)
            int r2 = com.google.android.libraries.material.p2206b.C28505a.m53283a(r2, r10)
            r1.setTint(r2)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.FormMainView r2 = r0.f36713i
            r2.setBackground(r1)
            goto L_0x0a45
        L_0x0a1b:
            com.google.assistant.e.j.e.em r1 = r2.f136325i
            if (r1 != 0) goto L_0x0a21
            com.google.assistant.e.j.e.em r1 = com.google.assistant.p3897e.p3921j.p3926e.C51933em.f136210b
        L_0x0a21:
            int r1 = r1.f136212a
            int r1 = com.google.assistant.p3897e.p3921j.p3926e.C51931ek.m86431a(r1)
            if (r1 != 0) goto L_0x0a2a
            goto L_0x0a2d
        L_0x0a2a:
            r2 = 2
            if (r1 == r2) goto L_0x0a3f
        L_0x0a2d:
            boolean r1 = r9 instanceof com.google.android.libraries.assistant.assistantactions.rendering.p638b.C11290h
            if (r1 != 0) goto L_0x0a32
            goto L_0x0a3f
        L_0x0a32:
            com.google.android.libraries.assistant.assistantactions.rendering.ui.FormMainView r1 = r0.f36713i
            r2 = 2131232048(0x7f080530, float:1.8080194E38)
            android.graphics.drawable.Drawable r2 = r10.getDrawable(r2)
            r1.setBackground(r2)
            goto L_0x0a45
        L_0x0a3f:
            com.google.android.libraries.assistant.assistantactions.rendering.ui.FormMainView r1 = r0.f36713i
            r2 = 0
            r1.setBackground(r2)
        L_0x0a45:
            android.widget.LinearLayout r1 = r0.f36712h
            com.google.android.libraries.assistant.assistantactions.rendering.ui.FormMainView r2 = r0.f36713i
            r1.addView(r2)
            r6 = 1
            goto L_0x0a4f
        L_0x0a4e:
            r6 = 0
        L_0x0a4f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.rendering.p638b.C11286d.mo19694d(com.google.assistant.e.j.dy):boolean");
    }
}
