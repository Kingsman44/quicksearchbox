package com.google.android.libraries.lens.view.p2057ag;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.Toolbar;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p098j.C2043bi;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.education.bloom.mathview.render.C9111q;
import com.google.android.apps.education.bloom.mathview.render.LatexEditText;
import com.google.android.apps.education.bloom.mathview.render.keyboard.C9091l;
import com.google.android.apps.education.bloom.mathview.render.keyboard.LatexKeyboardView;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2057ag.p2058a.C25099b;
import com.google.android.libraries.lens.view.p2090ba.C25684e;
import com.google.android.libraries.lens.view.p2093d.C25752a;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.C28458c;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.p3589d.p3590a.C45686c;
import com.google.apps.p3589d.p3590a.C45704u;
import com.google.apps.p3589d.p3590a.C45705v;
import com.google.apps.p3589d.p3591b.C45712c;
import com.google.apps.p3589d.p3591b.C45723n;
import com.google.apps.p3589d.p3591b.C45724o;
import com.google.apps.p3589d.p3594e.C45776f;
import com.google.apps.p3589d.p3594e.C45787q;
import com.google.apps.p3589d.p3594e.C45788r;
import com.google.apps.p3589d.p3594e.C45795y;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47387a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import p5462h.C69788q;
import p5462h.p5463a.C69531o;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.libraries.lens.view.ag.g */
/* compiled from: PG */
public final class C25105g extends C25114p implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C25112n f68384a;

    /* renamed from: b */
    private Context f68385b;

    /* renamed from: c */
    private final C2393x f68386c = new C2393x(this);

    /* renamed from: d */
    private final C47515ab f68387d = new C47515ab(this);

    /* renamed from: e */
    private boolean f68388e;

    @Deprecated
    public C25105g() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C25112n mo17754z() {
        C25112n nVar = this.f68384a;
        if (nVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f68388e) {
            return nVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo30260b() {
        return new C47242k(this);
    }

    public final void dismiss() {
        C47573bx w = C47831fm.m85028w();
        try {
            super.dismiss();
            w.close();
            return;
        } catch (Throwable th) {
            C25104f.m46402a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f68385b == null) {
            this.f68385b = new C47236e((Fragment) this, super.getContext());
        }
        return this.f68385b;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f68387d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f68386c;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f68387d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f68387d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25104f.m46402a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f68387d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C25104f.m46402a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f68387d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25104f.m46402a(th, th);
        }
        throw th;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f68387d.mo51378f("DialogFragment:onCancel").close();
    }

    public final void onCreate(Bundle bundle) {
        this.f68387d.mo51381i();
        try {
            super.onCreate(bundle);
            C25112n a = mo17754z();
            a.f68395b.setStyle(0, 2132150765);
            a.f68405l = new C25107i(a);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25104f.m46402a(th, th);
        }
        throw th;
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f68387d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C25104f.m46402a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C69788q qVar;
        C9111q[] qVarArr;
        this.f68387d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            C25112n a = mo17754z();
            String str = a.f68394a.f68367a;
            a.f68402i = (ConstraintLayout) layoutInflater.inflate(R.layout.math_editor, viewGroup, false);
            a.f68404k = (LatexKeyboardView) a.f68402i.findViewById(R.id.math_editor_latex_keyboard);
            a.f68403j = (LatexEditText) a.f68402i.findViewById(R.id.math_editor_latex);
            LatexEditText latexEditText = a.f68403j;
            latexEditText.f31270b = a.f68404k;
            C69664n.m101061g(str, "latex");
            C9111q b = latexEditText.mo17329b(str);
            if (b != null) {
                latexEditText.setText(new SpannableStringBuilder().append(b.mo17421b(), b, 33), TextView.BufferType.EDITABLE);
            }
            LatexEditText latexEditText2 = a.f68403j;
            LatexKeyboardView latexKeyboardView = latexEditText2.f31270b;
            if (latexKeyboardView != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Editable text = latexEditText2.getText();
                if (text == null || (qVarArr = (C9111q[]) text.getSpans(0, latexEditText2.length(), C9111q.class)) == null) {
                    qVar = null;
                } else {
                    for (C9111q qVar2 : qVarArr) {
                        C45705v vVar = qVar2.f31381b;
                        C45724o d = C45724o.m81498d();
                        C45724o d2 = C45724o.m81498d();
                        ((C45795y) vVar).f120407c.f120310b.mo49863g(new C45787q(d, d2), C45788r.f120389a);
                        C45723n nVar = new C45723n(0);
                        d.mo49823b(new C45776f(nVar, d2));
                        C45712c cVar = new C45712c(nVar.mo49829f());
                        while (cVar.hasNext()) {
                            C45704u uVar = (C45704u) cVar.next();
                            String b2 = uVar.mo49749b();
                            C69664n.m101060f(b2, "variableStat.displayString()");
                            Object obj = linkedHashMap.get(b2);
                            if (obj == null) {
                                obj = new ArrayList();
                                linkedHashMap.put(b2, obj);
                            }
                            ((List) obj).add(uVar);
                        }
                    }
                    qVar = C69788q.f186170a;
                }
                if (qVar != null) {
                    Iterator it = linkedHashMap.values().iterator();
                    int size = linkedHashMap.size();
                    C45704u[] uVarArr = new C45704u[size];
                    for (int i = 0; i < size; i++) {
                        List<C45704u> list = (List) it.next();
                        int i2 = 0;
                        for (C45704u a2 : list) {
                            i2 += a2.mo49748a();
                        }
                        uVarArr[i] = new C45686c(((C45704u) C69540x.m100819A(list)).mo49749b(), ((C45704u) C69540x.m100819A(list)).mo49750c(), i2);
                    }
                    Iterable i3 = C69531o.m100932i(uVarArr);
                    C69664n.m101061g(i3, "vars");
                    C9091l lVar = latexKeyboardView.f31305b;
                    C69664n.m101061g(i3, "vars");
                    List list2 = lVar.f31350b;
                    ArrayList arrayList = new ArrayList();
                    for (Object next : i3) {
                        C45704u uVar2 = (C45704u) next;
                        C69664n.m101061g(uVar2, "<this>");
                        String b3 = uVar2.mo49749b();
                        C69664n.m101060f(b3, "displayString()");
                        if (C69764m.m101205y("𝑎𝑏𝑐𝑑𝑒𝑓𝑔ℎ𝑖𝑗𝑘𝑙𝑚𝑛𝑜𝑝𝑞𝑟𝑠𝑡𝑢𝑣𝑤𝑥𝑦𝑧𝐴𝐵𝐶𝐷𝐸𝐹𝐺𝐻𝐼𝐽𝐾𝐿𝑀𝑁𝑂𝑃𝑄𝑅𝑆𝑇𝑈𝑉𝑊𝑋𝑌𝑍", b3, false)) {
                            arrayList.add(next);
                        }
                    }
                    list2.set(0, arrayList);
                    List list3 = lVar.f31350b;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object next2 : i3) {
                        C45704u uVar3 = (C45704u) next2;
                        C69664n.m101061g(uVar3, "<this>");
                        String b4 = uVar3.mo49749b();
                        C69664n.m101060f(b4, "displayString()");
                        if (C69764m.m101205y("𝛼𝛽𝛾𝛿𝜀𝜁𝜂𝜃𝜄𝜅𝜆𝜇𝜈𝜉𝜊𝜋𝜌𝜎𝜍𝜏𝜐𝜑𝜒𝜓𝜔𝜖𝜗𝜘𝜙𝜚𝜛ΑΒΓΔΕΖΗΘΙΚΛΜΝΞΟΠΡΣΤΥΦΧΨΩ", b4, false)) {
                            arrayList2.add(next2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object next3 : arrayList2) {
                        String b5 = ((C45704u) next3).mo49749b();
                        C69664n.m101060f(b5, "it.displayString()");
                        if (!C69764m.m101205y("𝜃𝜋", b5, false)) {
                            arrayList3.add(next3);
                        }
                    }
                    list3.set(1, arrayList3);
                    lVar.mObservable.mo2881c(0, 2, (Object) null);
                }
            }
            Editable text2 = a.f68403j.getText();
            if (text2 != null) {
                a.f68403j.setSelection(text2.length());
            }
            Dialog dialog = a.f68395b.getDialog();
            if (dialog != null) {
                dialog.setOnShowListener(new C28458c(a.f68395b, new C25106h(a)));
            }
            ConstraintLayout constraintLayout = a.f68402i;
            C47831fm.m85019n();
            return constraintLayout;
        } catch (Throwable th) {
            C25104f.m46402a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f68387d.mo51374b();
        try {
            super.onDestroy();
            b.close();
            return;
        } catch (Throwable th) {
            C25104f.m46402a(th, th);
        }
        throw th;
    }

    public final void onDestroyView() {
        C47573bx c = this.f68387d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C25104f.m46402a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f68387d.mo51376d();
        try {
            super.onDetach();
            this.f68388e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C25104f.m46402a(th, th);
        }
        throw th;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47573bx f = this.f68387d.mo51378f("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            f.close();
            return;
        } catch (Throwable th) {
            C25104f.m46402a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f68387d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C25104f.m46402a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f68387d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C25104f.m46402a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f68387d.mo51381i();
        try {
            super.onPause();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25104f.m46402a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f68387d.mo51377e();
        try {
            super.onResume();
            e.close();
            return;
        } catch (Throwable th) {
            C25104f.m46402a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f68387d.mo51381i();
        try {
            super.onSaveInstanceState(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25104f.m46402a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f68387d.mo51381i();
        try {
            super.onStart();
            mo17754z().f68397d.mo30258b(C25101c.MATH_EDITOR_FRAGMENT);
            C47387a.m84225b(this);
            if (getShowsDialog()) {
                C47387a.m84224a(this);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25104f.m46402a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f68387d.mo51381i();
        try {
            super.onStop();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25104f.m46402a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f68387d.mo51381i();
        try {
            C25112n a = mo17754z();
            C2043bi.m5555ai(a.f68402i, new C25108j());
            a.f68403j.setOnEditorActionListener(a.f68405l);
            view.findViewById(R.id.clear_all_button).setOnClickListener(new C47591co(a.f68401h, "Click clear all", new C25109k(a)));
            C25752a a2 = a.f68397d.mo30257a(C58836b.f156633a);
            Typeface typeface = (Typeface) ((C58833ax) a2.mo3842a()).mo56109e(Typeface.defaultFromStyle(0));
            a.f68403j.mo17331c(typeface);
            a.f68404k.mo17386c(typeface);
            a2.mo5704e(a.f68395b.getViewLifecycleOwner(), new C25110l(a));
            Toolbar toolbar = (Toolbar) a.f68402i.findViewById(R.id.math_editor_toolbar);
            toolbar.mo2419t(new C47591co(a.f68401h, "Click back", new C25111m(a)));
            toolbar.mo2415p(R.string.lens_back);
            if (!a.f68394a.f68368b) {
                Snackbar p = Snackbar.m79660p(view, R.string.lens_math_editor_truncated_query_message, 0);
                p.mo48349n(view.findViewById(R.id.snackbar_anchor));
                p.mo48343h();
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C25104f.m46402a(th, th);
        }
        throw th;
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f68387d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f68387d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f68387d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReenterTransition(obj);
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void setReturnTransition(Object obj) {
        C47515ab abVar = this.f68387d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f68387d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f68387d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementReturnTransition(obj);
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        this.f68387d.mo51381i();
        try {
            if (!this.f68388e) {
                super.onAttach(context);
                if (this.f68384a == null) {
                    Object jN = mo30265d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C25105g) {
                        C25105g gVar = (C25105g) fragment;
                        C68225k.m98532d(gVar);
                        Bundle b = ((C74176nj) jN).mo69504b();
                        C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C25099b bVar = (C25099b) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C25099b.f68365c, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                        C68225k.m98532d(bVar);
                        this.f68384a = new C25112n(gVar, ((C74176nj) jN).f206836d.mo68976I(), (C25102d) ((C74176nj) jN).f206836d.f205250aR.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), (C25684e) ((C74176nj) jN).f206836d.f205219N.mo17428b(), (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), bVar, (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f68387d, this.f68386c));
                    } else {
                        String obj = C25112n.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                this.f68384a.f68397d.mo30258b(C25101c.MATH_EDITOR_FRAGMENT);
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f68387d;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C25104f.m46402a(th, th2);
            }
            throw th;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
