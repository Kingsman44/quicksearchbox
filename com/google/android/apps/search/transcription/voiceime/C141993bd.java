package com.google.android.apps.search.transcription.voiceime;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.transcription.C141741b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58837ba;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.transcription.voiceime.bd */
/* compiled from: PG */
public final class C141993bd {

    /* renamed from: a */
    public static final C59071e f385285a = C59071e.m91332i("com.google.android.apps.search.transcription.voiceime.bd");

    /* renamed from: b */
    public final C60888db f385286b;

    /* renamed from: c */
    public final C141972ak f385287c;

    /* renamed from: d */
    public final Context f385288d;

    /* renamed from: e */
    public final Deque f385289e = new ArrayDeque();

    /* renamed from: f */
    public C141987ay f385290f;

    /* renamed from: g */
    public C141987ay f385291g;

    /* renamed from: h */
    public InputConnection f385292h;

    /* renamed from: i */
    public EditorInfo f385293i;

    /* renamed from: j */
    public Integer f385294j;

    /* renamed from: k */
    public C141741b f385295k;

    /* renamed from: l */
    public String f385296l;

    public C141993bd(C60888db dbVar, C141972ak akVar, Context context) {
        this.f385286b = dbVar;
        this.f385287c = akVar;
        this.f385288d = context;
    }

    /* renamed from: d */
    public static void m230509d() {
        C58838bb.m90883r(Looper.getMainLooper().getThread() == Thread.currentThread());
    }

    /* renamed from: k */
    private final void m230510k(int i, int i2) {
        this.f385291g = new C141987ay(i, i2);
        this.f385292h.setComposingRegion(i, i2);
    }

    /* renamed from: a */
    public final C141741b mo116949a(EditorInfo editorInfo, int i) {
        C58485gu f;
        String nameForUid = this.f385288d.getPackageManager().getNameForUid(i);
        if (nameForUid == null) {
            nameForUid = C58837ba.m90858g(editorInfo.packageName);
        }
        String str = nameForUid;
        C141972ak akVar = this.f385287c;
        C141986ax axVar = new C141986ax(this);
        if (editorInfo.hintLocales == null) {
            f = C58485gu.m89845m();
        } else {
            C58480gp e = C58485gu.m89837e();
            for (int i2 = 0; i2 < editorInfo.hintLocales.size(); i2++) {
                e.mo55395g(editorInfo.hintLocales.get(i2));
            }
            f = e.mo55394f();
        }
        C58485gu guVar = f;
        ((C59052c) ((C59052c) C141972ak.f385237b.mo56224b()).mo56372aa(41976)).mo56386p("#startListening");
        C141741b a = akVar.f385241f.mo116843a();
        C60870cx d = akVar.f385244i.f36128a.mo46042d();
        C142045y yVar = new C142045y(akVar, axVar, a, str, guVar);
        C60856cj.m92911t(d, C47810es.m84974n(yVar), akVar.f385242g);
        this.f385295k = a;
        this.f385296l = BuildConfig.FLAVOR;
        return a;
    }

    /* renamed from: b */
    public final C141987ay mo116950b() {
        if (this.f385289e.isEmpty()) {
            return this.f385290f;
        }
        return (C141987ay) this.f385289e.peekLast();
    }

    /* renamed from: c */
    public final C60870cx mo116951c() {
        if (!mo116957j()) {
            return C60866ct.f164955a;
        }
        C141985aw awVar = new C141985aw(this);
        return C60856cj.m92902k(C47810es.m84965e(awVar), 200, TimeUnit.MILLISECONDS, this.f385286b);
    }

    /* renamed from: e */
    public final void mo116952e() {
        C141972ak akVar = this.f385287c;
        C141741b bVar = this.f385295k;
        if (bVar != null) {
            ((C59052c) ((C59052c) C141972ak.f385237b.mo56224b()).mo56372aa(41978)).mo56386p("#closeMicrophone");
            C141971aj ajVar = (C141971aj) akVar.f385246k.get(Long.valueOf(bVar.f384722b));
            if (ajVar != null) {
                ajVar.f385235b.mo116756c();
            }
        }
    }

    /* renamed from: f */
    public final void mo116953f() {
        this.f385287c.mo116932b(this.f385295k);
        this.f385292h = null;
        this.f385293i = null;
        this.f385294j = null;
        this.f385295k = null;
        this.f385290f = null;
        this.f385291g = null;
        this.f385296l = null;
    }

    /* renamed from: g */
    public final void mo116954g() {
        InputConnection inputConnection = this.f385292h;
        if (inputConnection != null) {
            ExtractedText extractedText = inputConnection.getExtractedText(new ExtractedTextRequest(), 0);
            if (extractedText == null || TextUtils.isEmpty(extractedText.text) || !C142004g.m230534e(extractedText.selectionStart, extractedText.selectionEnd, extractedText.text.length())) {
                C141987ay ayVar = this.f385290f;
                if (ayVar != null) {
                    m230510k(ayVar.f385275a, ayVar.f385276b);
                } else {
                    m230510k(0, 0);
                }
            } else {
                int min = Math.min(extractedText.selectionStart, extractedText.selectionEnd);
                int max = Math.max(extractedText.selectionStart, extractedText.selectionEnd);
                CharSequence charSequence = extractedText.text;
                int a = C142004g.m230530a(charSequence.subSequence(0, min), false, 0);
                int f = C142004g.m230535f(charSequence.subSequence(max, charSequence.length()));
                if ((a <= 0 || f <= 0) && min == max) {
                    m230510k(max, max);
                } else {
                    m230510k(min - a, max + f);
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo116955h(String str) {
        String str2;
        String str3;
        m230509d();
        if (this.f385292h != null && !str.equals(this.f385296l)) {
            this.f385296l = str;
            C141987ay ayVar = this.f385291g;
            String trim = str.trim();
            ExtractedText extractedText = this.f385292h.getExtractedText(new ExtractedTextRequest(), 0);
            if (extractedText == null || extractedText.text == null) {
                str2 = C142004g.m230531b(trim, (CharSequence) null, this.f385293i.inputType);
            } else {
                int i = ayVar.f385276b - extractedText.startOffset;
                boolean z = i >= 0 && i < extractedText.text.length() && !Character.isWhitespace(extractedText.text.charAt(i)) && !C142004g.m230532c(String.valueOf(extractedText.text.charAt(i)));
                int i2 = (ayVar.f385275a - 1) - extractedText.startOffset;
                boolean z2 = i2 >= 0 && i2 < extractedText.text.length() && !Character.isWhitespace(extractedText.text.charAt(i2));
                if (trim.length() > 0 && (C142004g.m230532c(String.valueOf(trim.charAt(0))) || Character.isWhitespace(trim.charAt(0)))) {
                    z2 = false;
                }
                int i3 = ayVar.f385275a - extractedText.startOffset;
                String str4 = BuildConfig.FLAVOR;
                CharSequence subSequence = (i3 <= 0 || i3 > extractedText.text.length()) ? str4 : extractedText.text.subSequence(0, i3);
                if (z2) {
                    subSequence = String.valueOf(String.valueOf(subSequence)).concat(" ");
                }
                String b = C142004g.m230531b(trim, subSequence, this.f385293i.inputType);
                if (true != z2) {
                    str3 = str4;
                } else {
                    str3 = " ";
                }
                if (true == z) {
                    str4 = " ";
                }
                str2 = str3 + b + str4;
            }
            C141987ay ayVar2 = this.f385291g;
            C141987ay ayVar3 = new C141987ay(ayVar2.f385275a + str2.length(), ayVar2.f385275a + str2.length());
            if (!ayVar3.equals(mo116950b())) {
                this.f385289e.add(ayVar3);
            }
            int i4 = ayVar2.f385275a;
            this.f385291g = new C141987ay(i4, str2.length() + i4);
            this.f385292h.setComposingText(str2, 1);
        }
    }

    /* renamed from: i */
    public final void mo116956i(InputConnection inputConnection, EditorInfo editorInfo, int i) {
        this.f385292h = inputConnection;
        this.f385293i = editorInfo;
        this.f385294j = Integer.valueOf(i);
    }

    /* renamed from: j */
    public final boolean mo116957j() {
        if (this.f385292h == null) {
            return false;
        }
        this.f385287c.mo116931a(this.f385295k);
        this.f385292h.finishComposingText();
        ExtractedText extractedText = this.f385292h.getExtractedText(new ExtractedTextRequest(), 0);
        if (extractedText == null || TextUtils.isEmpty(extractedText.text)) {
            return false;
        }
        int min = Math.min(extractedText.selectionStart, extractedText.selectionEnd);
        int max = Math.max(extractedText.selectionStart, extractedText.selectionEnd);
        if (min != max) {
            this.f385292h.setSelection(min, min);
            this.f385292h.deleteSurroundingText(0, max - min);
        } else {
            InputConnection inputConnection = this.f385292h;
            CharSequence charSequence = extractedText.text;
            if (min < 0 || min > charSequence.length()) {
                ((C59052c) ((C59052c) f385285a.mo56225c()).mo56372aa(41993)).mo56386p("#deleteLastText cursor position out of text range. Should not happen");
            } else {
                int a = C142004g.m230530a(charSequence.subSequence(0, min), true, 0);
                if (a > 0) {
                    inputConnection.deleteSurroundingText(a, Math.max(0, C142004g.m230535f(charSequence.subSequence(min - 1, charSequence.length())) - 1));
                } else {
                    inputConnection.deleteSurroundingText(1, 0);
                }
            }
        }
        return true;
    }
}
