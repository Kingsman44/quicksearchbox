package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.provider.ContactsContract;
import android.text.util.Rfc822Token;
import com.google.android.apps.gsa.search.shared.actions.C87421i;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.core.ShowContactInformationAction;
import com.google.android.apps.gsa.search.shared.common.util.C87510b;
import com.google.android.apps.gsa.search.shared.contact.C87516d;
import com.google.android.apps.gsa.search.shared.contact.Contact;
import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.ac */
/* compiled from: PG */
public final class C93255ac extends C93278j {

    /* renamed from: c */
    private final Context f260023c;

    public C93255ac(C91097g gVar, Context context) {
        super(context, gVar);
        this.f260023c = context;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C87421i mo87580a(VoiceAction voiceAction, int i) {
        ShowContactInformationAction showContactInformationAction = (ShowContactInformationAction) voiceAction;
        switch (i) {
            case 101:
                Contact Q = showContactInformationAction.mo81152Q();
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setDataAndType(Uri.parse("mailto:"), "text/plain");
                intent.putExtra("android.intent.extra.EMAIL", new String[]{new Rfc822Token(Q.f236353d, Q.f236354e, (String) null).toString()});
                this.f260114b.mo65089a(intent);
                return C87421i.f236079a;
            case 102:
                return this.f260114b.mo65089a(C93266an.m153355a(showContactInformationAction.mo81152Q().f236354e)) ? C87421i.f236079a : C87421i.f236081c;
            case 103:
                String str = showContactInformationAction.mo81152Q().f236354e;
                if (str != null) {
                    if (this.f260114b.mo65089a(C87510b.m142044b(Uri.parse("http://maps.google.com/").buildUpon().appendQueryParameter("q", str).build(), this.f260023c))) {
                        return C87421i.f236079a;
                    }
                }
                return C87421i.f236081c;
            case 104:
                String str2 = showContactInformationAction.mo81152Q().f236354e;
                if (str2 != null) {
                    C91097g gVar = this.f260114b;
                    Intent intent2 = new Intent("android.intent.action.CALL");
                    intent2.setData(Uri.fromParts("tel", str2, (String) null));
                    if (gVar.mo65089a(intent2)) {
                        return C87421i.f236079a;
                    }
                }
                return C87421i.f236081c;
            default:
                return super.mo87580a(showContactInformationAction, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ Intent mo87583c(VoiceAction voiceAction) {
        ShowContactInformationAction showContactInformationAction = (ShowContactInformationAction) voiceAction;
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Intent mo87584d(VoiceAction voiceAction) {
        ShowContactInformationAction showContactInformationAction = (ShowContactInformationAction) voiceAction;
        PersonDisambiguation personDisambiguation = showContactInformationAction.f236042f;
        if (personDisambiguation == null || !personDisambiguation.mo81543l()) {
            return Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_CONTACTS");
        }
        if (showContactInformationAction.f236058j) {
            Parcelable parcelable = personDisambiguation.f236364c;
            parcelable.getClass();
            return C87516d.m142150a((Person) parcelable);
        }
        Parcelable parcelable2 = personDisambiguation.f236364c;
        parcelable2.getClass();
        return C87516d.m142150a((Person) parcelable2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Intent mo87585e(VoiceAction voiceAction) {
        ShowContactInformationAction showContactInformationAction = (ShowContactInformationAction) voiceAction;
        return new Intent("android.intent.action.VIEW", ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, 7));
    }
}
