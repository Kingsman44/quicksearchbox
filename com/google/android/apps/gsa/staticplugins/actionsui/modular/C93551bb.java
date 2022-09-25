package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.view.LayoutInflater;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87440d;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.DateArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.DeviceSettingsArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.GroupArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.MediaControlArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.ProviderArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.RecurrenceArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeDurationArgument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeOfDayArgument;
import com.google.android.apps.gsa.search.shared.contact.Disambiguation;
import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.common.p4526f.C59052c;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.bb */
/* compiled from: PG */
final class C93551bb implements C87440d {

    /* renamed from: a */
    final /* synthetic */ DisambiguationContent f261209a;

    /* renamed from: b */
    private final C93602cz f261210b;

    /* renamed from: c */
    private final C88511e f261211c;

    public C93551bb(DisambiguationContent disambiguationContent, C93602cz czVar, C88511e eVar) {
        this.f261209a = disambiguationContent;
        this.f261210b = czVar;
        this.f261211c = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo81354a(DateArgument dateArgument) {
        ((C59052c) ((C59052c) DisambiguationContent.f261014a.mo56225c()).mo56372aa(13735)).mo56386p("Can't show ambiguous UI for date argument");
        return null;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo81355b(DeviceSettingsArgument deviceSettingsArgument) {
        ((C59052c) ((C59052c) DisambiguationContent.f261014a.mo56225c()).mo56372aa(13736)).mo56386p("Can't show ambiguous UI for device settings argument");
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo81356c(EntityArgument entityArgument) {
        DisambiguationContent disambiguationContent = this.f261209a;
        C88511e eVar = this.f261211c;
        C93602cz czVar = this.f261210b;
        if (!((Disambiguation) entityArgument.f236203n).mo81541i()) {
            disambiguationContent.mo87868h(disambiguationContent.f261017d);
            Disambiguation disambiguation = (Disambiguation) entityArgument.f236203n;
            int i = entityArgument.f236140a;
            EntityDisambiguationView entityDisambiguationView = disambiguationContent.f261017d;
            C93602cz czVar2 = disambiguationContent.f261015b;
            czVar2.getClass();
            entityDisambiguationView.f261023f = czVar2.mo82040ap();
            entityDisambiguationView.f261024g = eVar;
            disambiguationContent.f261017d.mo87751e(disambiguation, (Object) null, (Comparator) null);
            disambiguationContent.f261017d.mo87720b(new C93546ax(disambiguation, czVar, i));
            C89941l.m146512c(disambiguationContent.f261017d, entityArgument.mo81277l());
            disambiguationContent.f261022i = disambiguationContent.f261017d.f260790c;
        }
        return null;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo81357d(GroupArgument groupArgument) {
        ((C59052c) ((C59052c) DisambiguationContent.f261014a.mo56225c()).mo56372aa(13737)).mo56386p("Can't show ambiguous UI for group argument");
        return null;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo81358e(LocationArgument locationArgument) {
        DisambiguationContent disambiguationContent = this.f261209a;
        C93602cz czVar = this.f261210b;
        C93550ba baVar = new C93550ba(disambiguationContent, czVar);
        disambiguationContent.f261018e.mo87730d();
        disambiguationContent.mo87868h(disambiguationContent.f261018e);
        disambiguationContent.f261018e.mo87729c(baVar, czVar.mo82040ap(), (LayoutInflater) disambiguationContent.getContext().getSystemService("layout_inflater"));
        disambiguationContent.f261018e.mo88129p(locationArgument);
        disambiguationContent.f261018e.mo87732f();
        disambiguationContent.f261022i = disambiguationContent.f261018e.f260756c;
        return null;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo81359f(MediaControlArgument mediaControlArgument) {
        ((C59052c) ((C59052c) DisambiguationContent.f261014a.mo56225c()).mo56372aa(13739)).mo56386p("Can't show ambiguous UI for media-control argument");
        return null;
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ Object mo81360g(PersonArgument personArgument) {
        DisambiguationContent disambiguationContent = this.f261209a;
        C93602cz czVar = this.f261210b;
        for (Person person : ((PersonDisambiguation) personArgument.f236203n).f236363b) {
            person.f236390u = personArgument.mo81277l();
        }
        PersonDisambiguation personDisambiguation = (PersonDisambiguation) personArgument.f236203n;
        disambiguationContent.mo87868h(disambiguationContent.f261016c);
        int i = personArgument.f236140a;
        disambiguationContent.f261016c.mo87721c(personDisambiguation, personArgument.mo81316g(), new C93538ap(personArgument.f236144e.f236102h));
        disambiguationContent.f261016c.mo87720b(new C93547ay(disambiguationContent, personDisambiguation, personArgument, czVar, i));
        disambiguationContent.f261022i = disambiguationContent.f261016c.f260790c;
        return null;
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ Object mo81361h(ProviderArgument providerArgument) {
        DisambiguationContent disambiguationContent = this.f261209a;
        disambiguationContent.mo87868h(disambiguationContent.f261019f);
        int l = providerArgument.mo81277l();
        if (l <= 0) {
            l = 13239;
        }
        disambiguationContent.f261019f.f261240f = l;
        Disambiguation a = providerArgument.mo81320a();
        if (disambiguationContent.mo87870j(a)) {
            a.mo81538f();
        }
        disambiguationContent.f261019f.mo87908g(a);
        disambiguationContent.mo87867g(providerArgument);
        C89941l.m146512c(disambiguationContent.f261019f, 13240);
        disambiguationContent.f261022i = disambiguationContent.f261019f.f260790c;
        return null;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ Object mo81362i(RecurrenceArgument recurrenceArgument) {
        ((C59052c) ((C59052c) DisambiguationContent.f261014a.mo56225c()).mo56372aa(13740)).mo56386p("Can't show ambiguous UI for recurrence argument");
        return null;
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ Object mo81363j(TimeDurationArgument timeDurationArgument) {
        ((C59052c) ((C59052c) DisambiguationContent.f261014a.mo56225c()).mo56372aa(13742)).mo56386p("Can't show ambiguous UI for time duration argument");
        return null;
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ Object mo81364k(TimeOfDayArgument timeOfDayArgument) {
        ((C59052c) ((C59052c) DisambiguationContent.f261014a.mo56225c()).mo56372aa(13743)).mo56386p("Can't show ambiguous UI for time of day argument");
        return null;
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ Object mo81365l() {
        ((C59052c) ((C59052c) DisambiguationContent.f261014a.mo56225c()).mo56372aa(13734)).mo56386p("Can't show ambiguous UI for audio argument");
        return null;
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Object mo81366m() {
        ((C59052c) ((C59052c) DisambiguationContent.f261014a.mo56225c()).mo56372aa(13738)).mo56386p("Can't show ambiguous UI for list argument");
        return null;
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Object mo81367n() {
        ((C59052c) ((C59052c) DisambiguationContent.f261014a.mo56225c()).mo56372aa(13741)).mo56386p("Can't show ambiguous UI for string argument");
        return null;
    }
}
